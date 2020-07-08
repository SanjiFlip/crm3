package com.sc.mapper;

import com.sc.entity.RsPostMessage;
import com.sc.entity.RsPostMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RsPostMessageMapper {
    int countByExample(RsPostMessageExample example);

    int deleteByExample(RsPostMessageExample example);

    int deleteByPrimaryKey(Long postId);

    int insert(RsPostMessage record);

    int insertSelective(RsPostMessage record);

    List<RsPostMessage> selectByExample(RsPostMessageExample example);

    RsPostMessage selectByPrimaryKey(Long postId);

    int updateByExampleSelective(@Param("record") RsPostMessage record, @Param("example") RsPostMessageExample example);

    int updateByExample(@Param("record") RsPostMessage record, @Param("example") RsPostMessageExample example);

    int updateByPrimaryKeySelective(RsPostMessage record);

    int updateByPrimaryKey(RsPostMessage record);
}