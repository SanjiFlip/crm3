package com.sc.mapper;

import com.sc.entity.XsSaleDetail;
import com.sc.entity.XsSaleDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsSaleDetailMapper {
    int countByExample(XsSaleDetailExample example);

    int deleteByExample(XsSaleDetailExample example);

    int deleteByPrimaryKey(Long salesDetailId);

    int insert(XsSaleDetail record);

    int insertSelective(XsSaleDetail record);

    List<XsSaleDetail> selectByExample(XsSaleDetailExample example);

    XsSaleDetail selectByPrimaryKey(Long salesDetailId);

    int updateByExampleSelective(@Param("record") XsSaleDetail record, @Param("example") XsSaleDetailExample example);

    int updateByExample(@Param("record") XsSaleDetail record, @Param("example") XsSaleDetailExample example);

    int updateByPrimaryKeySelective(XsSaleDetail record);

    int updateByPrimaryKey(XsSaleDetail record);
}