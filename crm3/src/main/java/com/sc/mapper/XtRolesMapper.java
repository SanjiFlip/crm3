package com.sc.mapper;

import com.sc.entity.XtRoles;
import com.sc.entity.XtRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtRolesMapper {
    int countByExample(XtRolesExample example);

    int deleteByExample(XtRolesExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(XtRoles record);

    int insertSelective(XtRoles record);

    List<XtRoles> selectByExample(XtRolesExample example);

    XtRoles selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") XtRoles record, @Param("example") XtRolesExample example);

    int updateByExample(@Param("record") XtRoles record, @Param("example") XtRolesExample example);

    int updateByPrimaryKeySelective(XtRoles record);

    int updateByPrimaryKey(XtRoles record);
}