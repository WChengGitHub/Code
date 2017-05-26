package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TbCanteenWorker;
import pojo.TbCanteenWorkerExample;

public interface TbCanteenWorkerMapper {
    long countByExample(TbCanteenWorkerExample example);

    int deleteByExample(TbCanteenWorkerExample example);

    int deleteByPrimaryKey(String cwid);

    int insert(TbCanteenWorker record);

    int insertSelective(TbCanteenWorker record);

    List<TbCanteenWorker> selectByExample(TbCanteenWorkerExample example);

    TbCanteenWorker selectByPrimaryKey(String cwid);

    int updateByExampleSelective(@Param("record") TbCanteenWorker record, @Param("example") TbCanteenWorkerExample example);

    int updateByExample(@Param("record") TbCanteenWorker record, @Param("example") TbCanteenWorkerExample example);

    int updateByPrimaryKeySelective(TbCanteenWorker record);

    int updateByPrimaryKey(TbCanteenWorker record);
}