package com.sc.mapper;

import com.sc.entity.XsCustomerInfo;
import com.sc.entity.XsCustomerLose;
import com.sc.entity.XsCustomerLoseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsCustomerLoseMapper {
    int countByExample(XsCustomerLoseExample example);

    int deleteByExample(XsCustomerLoseExample example);
    
    int deleteByPrimaryKey(Long loseId);

    int insert(XsCustomerLose record);

    int insertSelective(XsCustomerLose record);

    List<XsCustomerLose> selectByExample(XsCustomerLoseExample example);
    
    XsCustomerLose selectByPrimaryKey(Long loseId);

    int updateByExampleSelective(@Param("record") XsCustomerLose record, @Param("example") XsCustomerLoseExample example);

    int updateByExample(@Param("record") XsCustomerLose record, @Param("example") XsCustomerLoseExample example);
    
    int updateByPrimaryKeySelective(XsCustomerLose record);

    int updateByPrimaryKey(XsCustomerLose record);
}