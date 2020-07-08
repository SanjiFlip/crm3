package com.sc.mapper;

import com.sc.entity.XsSaleDeliveryList;
import com.sc.entity.XsSaleDeliveryListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsSaleDeliveryListMapper {
    int countByExample(XsSaleDeliveryListExample example);

    int deleteByExample(XsSaleDeliveryListExample example);

    int deleteByPrimaryKey(Long salesId);

    int insert(XsSaleDeliveryList record);

    int insertSelective(XsSaleDeliveryList record);

    List<XsSaleDeliveryList> selectByExample(XsSaleDeliveryListExample example);

    XsSaleDeliveryList selectByPrimaryKey(Long salesId);

    int updateByExampleSelective(@Param("record") XsSaleDeliveryList record, @Param("example") XsSaleDeliveryListExample example);

    int updateByExample(@Param("record") XsSaleDeliveryList record, @Param("example") XsSaleDeliveryListExample example);

    int updateByPrimaryKeySelective(XsSaleDeliveryList record);

    int updateByPrimaryKey(XsSaleDeliveryList record);
}