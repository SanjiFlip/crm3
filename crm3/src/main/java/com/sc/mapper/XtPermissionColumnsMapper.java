package com.sc.mapper;

import com.sc.entity.XtPermissionColumns;
import com.sc.entity.XtPermissionColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtPermissionColumnsMapper {
    int countByExample(XtPermissionColumnsExample example);

    int deleteByExample(XtPermissionColumnsExample example);

    int deleteByPrimaryKey(Long columnsId);

    int insert(XtPermissionColumns record);

    int insertSelective(XtPermissionColumns record);

    List<XtPermissionColumns> selectByExample(XtPermissionColumnsExample example);

    XtPermissionColumns selectByPrimaryKey(Long columnsId);

    int updateByExampleSelective(@Param("record") XtPermissionColumns record, @Param("example") XtPermissionColumnsExample example);

    int updateByExample(@Param("record") XtPermissionColumns record, @Param("example") XtPermissionColumnsExample example);

    int updateByPrimaryKeySelective(XtPermissionColumns record);

    int updateByPrimaryKey(XtPermissionColumns record);
}