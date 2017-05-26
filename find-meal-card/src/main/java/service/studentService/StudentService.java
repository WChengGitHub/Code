package service.studentService;

import mapper.MultiFormMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user on 2017/5/24.
 */
@Service
public class StudentService {
    @Autowired
    private MultiFormMapper multiFormMapper;

    public String getAddress(String studentNumber){
        String address= multiFormMapper.selectAddress(studentNumber);
        return address;
    }
}
