package com.sc.mapper;

import com.sc.entity.RsDepartment;
import com.sc.entity.RsDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RsDepartmentMapper {
    int countByExample(RsDepartmentExample example);

    int deleteByExample(RsDepartmentExample example);

    int deleteByPrimaryKey(Long departmentId);

    int insert(RsDepartment record);

    int insertSelective(RsDepartment record);

    List<RsDepartment> selectByExample(RsDepartmentExample example);

    RsDepartment selectByPrimaryKey(Long departmentId);

    int updateByExampleSelective(@Param("record") RsDepartment record, @Param("example") RsDepartmentExample example);

    int updateByExample(@Param("record") RsDepartment record, @Param("example") RsDepartmentExample example);

    int updateByPrimaryKeySelective(RsDepartment record);

    int updateByPrimaryKey(RsDepartment record);
}