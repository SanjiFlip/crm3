package com.sc.mapper;

import com.sc.entity.BgSms;
import com.sc.entity.BgSmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgSmsMapper {
    int countByExample(BgSmsExample example);

    int deleteByExample(BgSmsExample example);

    int deleteByPrimaryKey(Long bhId);

    int insert(BgSms record);

    int insertSelective(BgSms record);

    List<BgSms> selectByExample(BgSmsExample example);

    BgSms selectByPrimaryKey(Long bhId);

    int updateByExampleSelective(@Param("record") BgSms record, @Param("example") BgSmsExample example);

    int updateByExample(@Param("record") BgSms record, @Param("example") BgSmsExample example);

    int updateByPrimaryKeySelective(BgSms record);

    int updateByPrimaryKey(BgSms record);
}