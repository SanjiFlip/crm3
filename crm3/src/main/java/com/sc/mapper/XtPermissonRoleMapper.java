package com.sc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sc.entity.XtPermissonRole;
import com.sc.entity.XtPermissonRoleExample;

public interface XtPermissonRoleMapper {
    int countByExample(XtPermissonRoleExample example);

    int deleteByExample(XtPermissonRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XtPermissonRole record);

    int insertSelective(XtPermissonRole record);

    List<XtPermissonRole> selectByExample(XtPermissonRoleExample example);

    XtPermissonRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XtPermissonRole record, @Param("example") XtPermissonRoleExample example);

    int updateByExample(@Param("record") XtPermissonRole record, @Param("example") XtPermissonRoleExample example);

    int updateByPrimaryKeySelective(XtPermissonRole record);

    int updateByPrimaryKey(XtPermissonRole record);
}