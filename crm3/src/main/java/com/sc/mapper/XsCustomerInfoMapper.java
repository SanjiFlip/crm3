package com.sc.mapper;

import com.sc.entity.XsCustomerInfo;
import com.sc.entity.XsCustomerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsCustomerInfoMapper {
    int countByExample(XsCustomerInfoExample example);

    int deleteByExample(XsCustomerInfoExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(XsCustomerInfo record);

    int insertSelective(XsCustomerInfo record);

    List<XsCustomerInfo> selectByExample(XsCustomerInfoExample example);

    XsCustomerInfo selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") XsCustomerInfo record, @Param("example") XsCustomerInfoExample example);

    int updateByExample(@Param("record") XsCustomerInfo record, @Param("example") XsCustomerInfoExample example);

    int updateByPrimaryKeySelective(XsCustomerInfo record);

    int updateByPrimaryKey(XsCustomerInfo record);
}