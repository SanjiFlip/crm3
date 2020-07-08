package com.sc.mapper;

import com.sc.entity.XtPermissionRole;
import com.sc.entity.XtPermissionRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtPermissionRoleMapper {
    int countByExample(XtPermissionRoleExample example);

    int deleteByExample(XtPermissionRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XtPermissionRole record);

    int insertSelective(XtPermissionRole record);

    List<XtPermissionRole> selectByExample(XtPermissionRoleExample example);

    XtPermissionRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XtPermissionRole record, @Param("example") XtPermissionRoleExample example);

    int updateByExample(@Param("record") XtPermissionRole record, @Param("example") XtPermissionRoleExample example);

    int updateByPrimaryKeySelective(XtPermissionRole record);

    int updateByPrimaryKey(XtPermissionRole record);
}