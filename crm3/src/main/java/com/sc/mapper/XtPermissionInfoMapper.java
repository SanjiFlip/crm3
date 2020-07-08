package com.sc.mapper;

import com.sc.entity.XtPermissionInfo;
import com.sc.entity.XtPermissionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtPermissionInfoMapper {
    int countByExample(XtPermissionInfoExample example);

    int deleteByExample(XtPermissionInfoExample example);

    int deleteByPrimaryKey(Long permissonId);

    int insert(XtPermissionInfo record);

    int insertSelective(XtPermissionInfo record);

    List<XtPermissionInfo> selectByExample(XtPermissionInfoExample example);

    XtPermissionInfo selectByPrimaryKey(Long permissonId);

    int updateByExampleSelective(@Param("record") XtPermissionInfo record, @Param("example") XtPermissionInfoExample example);

    int updateByExample(@Param("record") XtPermissionInfo record, @Param("example") XtPermissionInfoExample example);

    int updateByPrimaryKeySelective(XtPermissionInfo record);

    int updateByPrimaryKey(XtPermissionInfo record);
}