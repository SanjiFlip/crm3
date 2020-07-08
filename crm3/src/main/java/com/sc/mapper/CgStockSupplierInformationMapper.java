package com.sc.mapper;

import com.sc.entity.CgStockSupplierInformation;
import com.sc.entity.CgStockSupplierInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgStockSupplierInformationMapper {
    int countByExample(CgStockSupplierInformationExample example);

    int deleteByExample(CgStockSupplierInformationExample example);

    int deleteByPrimaryKey(Long supplierId);

    int insert(CgStockSupplierInformation record);

    int insertSelective(CgStockSupplierInformation record);

    List<CgStockSupplierInformation> selectByExample(CgStockSupplierInformationExample example);

    CgStockSupplierInformation selectByPrimaryKey(Long supplierId);

    int updateByExampleSelective(@Param("record") CgStockSupplierInformation record, @Param("example") CgStockSupplierInformationExample example);

    int updateByExample(@Param("record") CgStockSupplierInformation record, @Param("example") CgStockSupplierInformationExample example);

    int updateByPrimaryKeySelective(CgStockSupplierInformation record);

    int updateByPrimaryKey(CgStockSupplierInformation record);
}