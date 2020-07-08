package com.sc.mapper;

import com.sc.entity.BgExamineTarget;
import com.sc.entity.BgExamineTargetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgExamineTargetMapper {
    int countByExample(BgExamineTargetExample example);

    int deleteByExample(BgExamineTargetExample example);

    int deleteByPrimaryKey(Long targetId);

    int insert(BgExamineTarget record);

    int insertSelective(BgExamineTarget record);

    List<BgExamineTarget> selectByExample(BgExamineTargetExample example);

    BgExamineTarget selectByPrimaryKey(Long targetId);

    int updateByExampleSelective(@Param("record") BgExamineTarget record, @Param("example") BgExamineTargetExample example);

    int updateByExample(@Param("record") BgExamineTarget record, @Param("example") BgExamineTargetExample example);

    int updateByPrimaryKeySelective(BgExamineTarget record);

    int updateByPrimaryKey(BgExamineTarget record);
}