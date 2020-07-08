package com.sc.mapper;

import com.sc.entity.BgExamineTask;
import com.sc.entity.BgExamineTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgExamineTaskMapper {
    int countByExample(BgExamineTaskExample example);

    int deleteByExample(BgExamineTaskExample example);

    int deleteByPrimaryKey(Long taskId);

    int insert(BgExamineTask record);

    int insertSelective(BgExamineTask record);

    List<BgExamineTask> selectByExample(BgExamineTaskExample example);

    BgExamineTask selectByPrimaryKey(Long taskId);

    int updateByExampleSelective(@Param("record") BgExamineTask record, @Param("example") BgExamineTaskExample example);

    int updateByExample(@Param("record") BgExamineTask record, @Param("example") BgExamineTaskExample example);

    int updateByPrimaryKeySelective(BgExamineTask record);

    int updateByPrimaryKey(BgExamineTask record);
}