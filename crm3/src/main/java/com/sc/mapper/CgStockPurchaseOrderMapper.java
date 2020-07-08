package com.sc.mapper;

import com.sc.entity.CgStockPurchaseOrder;
import com.sc.entity.CgStockPurchaseOrderExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgStockPurchaseOrderMapper {
    int countByExample(CgStockPurchaseOrderExample example);

    int deleteByExample(CgStockPurchaseOrderExample example);

    int deleteByPrimaryKey(BigDecimal purchaseOrderId);

    int insert(CgStockPurchaseOrder record);

    int insertSelective(CgStockPurchaseOrder record);

    List<CgStockPurchaseOrder> selectByExample(CgStockPurchaseOrderExample example);

    CgStockPurchaseOrder selectByPrimaryKey(BigDecimal purchaseOrderId);

    int updateByExampleSelective(@Param("record") CgStockPurchaseOrder record, @Param("example") CgStockPurchaseOrderExample example);

    int updateByExample(@Param("record") CgStockPurchaseOrder record, @Param("example") CgStockPurchaseOrderExample example);

    int updateByPrimaryKeySelective(CgStockPurchaseOrder record);

    int updateByPrimaryKey(CgStockPurchaseOrder record);
}