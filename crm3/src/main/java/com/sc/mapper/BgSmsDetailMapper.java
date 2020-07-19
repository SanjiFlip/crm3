package com.sc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sc.entity.BgSmsDetail;
import com.sc.entity.BgSmsDetailExample;
import com.sc.entity.BgSmsDetailTwo;

public interface BgSmsDetailMapper {
    int countByExample(BgSmsDetailExample example);

    int deleteByExample(BgSmsDetailExample example);

    int deleteByPrimaryKey(Long detailId);

    int insert(BgSmsDetail record);

    int insertSelective(BgSmsDetail record);

    List<BgSmsDetail> selectByExample(BgSmsDetailExample example);

    BgSmsDetail selectByPrimaryKey(Long detailId);
    
    List<BgSmsDetailTwo> selectSmsDetailByName(Long recipientId);

    int updateByExampleSelective(@Param("record") BgSmsDetail record, @Param("example") BgSmsDetailExample example);

    int updateByExample(@Param("record") BgSmsDetail record, @Param("example") BgSmsDetailExample example);

    int updateByPrimaryKeySelective(BgSmsDetail record);

    int updateByPrimaryKey(BgSmsDetail record);
    
}