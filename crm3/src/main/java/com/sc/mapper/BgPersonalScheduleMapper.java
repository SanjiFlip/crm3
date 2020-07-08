package com.sc.mapper;

import com.sc.entity.BgPersonalSchedule;
import com.sc.entity.BgPersonalScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgPersonalScheduleMapper {
    int countByExample(BgPersonalScheduleExample example);

    int deleteByExample(BgPersonalScheduleExample example);

    int deleteByPrimaryKey(Long schedulePlanId);

    int insert(BgPersonalSchedule record);

    int insertSelective(BgPersonalSchedule record);

    List<BgPersonalSchedule> selectByExample(BgPersonalScheduleExample example);

    BgPersonalSchedule selectByPrimaryKey(Long schedulePlanId);

    int updateByExampleSelective(@Param("record") BgPersonalSchedule record, @Param("example") BgPersonalScheduleExample example);

    int updateByExample(@Param("record") BgPersonalSchedule record, @Param("example") BgPersonalScheduleExample example);

    int updateByPrimaryKeySelective(BgPersonalSchedule record);

    int updateByPrimaryKey(BgPersonalSchedule record);
}