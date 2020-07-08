package com.sc.mapper;

import com.sc.entity.RsCompnayMessage;
import com.sc.entity.RsCompnayMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RsCompnayMessageMapper {
    int countByExample(RsCompnayMessageExample example);

    int deleteByExample(RsCompnayMessageExample example);

    int deleteByPrimaryKey(Long compnayId);

    int insert(RsCompnayMessage record);

    int insertSelective(RsCompnayMessage record);

    List<RsCompnayMessage> selectByExample(RsCompnayMessageExample example);

    RsCompnayMessage selectByPrimaryKey(Long compnayId);

    int updateByExampleSelective(@Param("record") RsCompnayMessage record, @Param("example") RsCompnayMessageExample example);

    int updateByExample(@Param("record") RsCompnayMessage record, @Param("example") RsCompnayMessageExample example);

    int updateByPrimaryKeySelective(RsCompnayMessage record);

    int updateByPrimaryKey(RsCompnayMessage record);
}