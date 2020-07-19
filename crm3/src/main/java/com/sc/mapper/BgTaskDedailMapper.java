package com.sc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sc.entity.BgTaskDedail;
import com.sc.entity.BgTaskDedailExample;
import com.sc.entity.BgTaskDedailTwo;

public interface BgTaskDedailMapper {
    int countByExample(BgTaskDedailExample example);

    int deleteByExample(BgTaskDedailExample example);

    int deleteByPrimaryKey(Long bhId);
    
    int deleteByTaskId(Long taskId);

    int insert(BgTaskDedail record);

    int insertSelective(BgTaskDedail record);

    List<BgTaskDedail> selectByExample(BgTaskDedailExample example);
    
    List<BgTaskDedailTwo> selectTaskDedailById(Long acceptUserId);

    BgTaskDedail selectByPrimaryKey(Long bhId);

    int updateByExampleSelective(@Param("record") BgTaskDedail record, @Param("example") BgTaskDedailExample example);

    int updateByExample(@Param("record") BgTaskDedail record, @Param("example") BgTaskDedailExample example);

    int updateByPrimaryKeySelective(BgTaskDedail record);

    int updateByPrimaryKey(BgTaskDedail record);
    
    int updateByWhetherFinish(BgTaskDedail record);
    
    int updateByState(BgTaskDedail record);
}