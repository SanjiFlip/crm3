package com.sc.mapper;

import com.sc.entity.BgSmsDetail;
import com.sc.entity.BgSmsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgSmsDetailMapper {
    int countByExample(BgSmsDetailExample example);

    int deleteByExample(BgSmsDetailExample example);

    int deleteByPrimaryKey(Long detailId);

    int insert(BgSmsDetail record);

    int insertSelective(BgSmsDetail record);

    List<BgSmsDetail> selectByExample(BgSmsDetailExample example);

    BgSmsDetail selectByPrimaryKey(Long detailId);

    int updateByExampleSelective(@Param("record") BgSmsDetail record, @Param("example") BgSmsDetailExample example);

    int updateByExample(@Param("record") BgSmsDetail record, @Param("example") BgSmsDetailExample example);

    int updateByPrimaryKeySelective(BgSmsDetail record);

    int updateByPrimaryKey(BgSmsDetail record);
}