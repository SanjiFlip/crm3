package com.sc.mapper;

import com.sc.entity.CgStockDetailOrder;
import com.sc.entity.CgStockDetailOrderExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgStockDetailOrderMapper {
    int countByExample(CgStockDetailOrderExample example);

    int deleteByExample(CgStockDetailOrderExample example);

    int deleteByPrimaryKey(BigDecimal purchaseOrderDetailId);

    int insert(CgStockDetailOrder record);

    int insertSelective(CgStockDetailOrder record);

    List<CgStockDetailOrder> selectByExample(CgStockDetailOrderExample example);

    CgStockDetailOrder selectByPrimaryKey(BigDecimal purchaseOrderDetailId);

    int updateByExampleSelective(@Param("record") CgStockDetailOrder record, @Param("example") CgStockDetailOrderExample example);

    int updateByExample(@Param("record") CgStockDetailOrder record, @Param("example") CgStockDetailOrderExample example);

    int updateByPrimaryKeySelective(CgStockDetailOrder record);

    int updateByPrimaryKey(CgStockDetailOrder record);
}