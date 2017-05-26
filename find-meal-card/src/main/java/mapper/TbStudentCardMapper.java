package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TbStudentCard;
import pojo.TbStudentCardExample;

public interface TbStudentCardMapper {
    long countByExample(TbStudentCardExample example);

    int deleteByExample(TbStudentCardExample example);

    int deleteByPrimaryKey(String cid);

    int insert(TbStudentCard record);

    int insertSelective(TbStudentCard record);

    List<TbStudentCard> selectByExample(TbStudentCardExample example);

    TbStudentCard selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") TbStudentCard record, @Param("example") TbStudentCardExample example);

    int updateByExample(@Param("record") TbStudentCard record, @Param("example") TbStudentCardExample example);

    int updateByPrimaryKeySelective(TbStudentCard record);

    int updateByPrimaryKey(TbStudentCard record);
}