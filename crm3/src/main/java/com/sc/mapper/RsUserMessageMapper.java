package com.sc.mapper;

import com.sc.entity.RsUserMessage;
import com.sc.entity.RsUserMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RsUserMessageMapper {
    int countByExample(RsUserMessageExample example);

    int deleteByExample(RsUserMessageExample example);

    int deleteByPrimaryKey(Long staffId);

    int insert(RsUserMessage record);

    int insertSelective(RsUserMessage record);

    List<RsUserMessage> selectByExample(RsUserMessageExample example);

    RsUserMessage selectByPrimaryKey(Long staffId);

    int updateByExampleSelective(@Param("record") RsUserMessage record, @Param("example") RsUserMessageExample example);

    int updateByExample(@Param("record") RsUserMessage record, @Param("example") RsUserMessageExample example);

    int updateByPrimaryKeySelective(RsUserMessage record);

    int updateByPrimaryKey(RsUserMessage record);
}