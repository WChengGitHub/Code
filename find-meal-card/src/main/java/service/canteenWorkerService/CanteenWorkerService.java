package service.canteenWorkerService;

import mapper.TbCanteenWorkerMapper;
import mapper.TbStudentCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.TbCanteenWorker;
import pojo.TbCanteenWorkerExample;
import pojo.TbStudentCard;
import pojo.TbStudentCardExample;
import utils.GetId;

import java.util.List;

/**
 * Created by user on 2017/5/23.
 */
@Service
public class CanteenWorkerService {

    @Autowired
    private TbCanteenWorkerMapper canteenWorkerMapper;

    @Autowired
    private TbStudentCardMapper studentCardMapper;

    public boolean signUp(String phone,String password,String address){
        TbCanteenWorker canteenWorker=new TbCanteenWorker();
        canteenWorker.setCwid(GetId.getId());
        canteenWorker.setPassword(password);
        canteenWorker.setPhone(phone);
        canteenWorker.setAddress(address);
        try {
            canteenWorkerMapper.insert(canteenWorker);
            return true;
        }catch (Exception e) {
           e.printStackTrace();
        }
        return false;
    }
    public TbCanteenWorker signIn(String phone,String password){
        TbCanteenWorker canteenWorker=null;
        List<TbCanteenWorker> canteenWorkerList;
        TbCanteenWorkerExample canteenWorkerExample=new TbCanteenWorkerExample();
        TbCanteenWorkerExample.Criteria criteria=canteenWorkerExample.createCriteria();
        criteria.andPhoneEqualTo(phone);
        criteria.andPasswordEqualTo(password);
        canteenWorkerList=canteenWorkerMapper.selectByExample(canteenWorkerExample);
        if(canteenWorkerList!=null&&canteenWorkerList.size()>0){
            canteenWorker=canteenWorkerList.get(0);
        }
        return canteenWorker;
    }

    public void add(String cwid,String studentNumber){
        TbStudentCard studentCard=new TbStudentCard();
        studentCard.setCid(GetId.getId());
        studentCard.setCwid(cwid);
        studentCard.setStatus(false);
        studentCard.setStudentnumber(studentNumber);
        studentCardMapper.insert(studentCard);
    }
    public void confrim(String studentNumber){
        TbStudentCard studentCard=new TbStudentCard();
        studentCard.setStatus(true);
        TbStudentCardExample studentCardExample=new TbStudentCardExample();
        TbStudentCardExample.Criteria criteria=studentCardExample.createCriteria();
        criteria.andStudentnumberEqualTo(studentNumber);
        studentCardMapper.updateByExampleSelective(studentCard,studentCardExample);
    }
}
