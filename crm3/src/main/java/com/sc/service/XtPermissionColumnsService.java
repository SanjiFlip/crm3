package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPermissionColumns;

public interface XtPermissionColumnsService {
	
	void addColumns(XtPermissionColumns xpc);
	
	void updateColumns(XtPermissionColumns xpc);
	
	void deleteColumns(Long columnsId);
	
	PageInfo<XtPermissionColumns> selectPermColumns(Integer pageNum,Integer pageSize,XtPermissionColumns xpc);
	
	XtPermissionColumns getColumns(Long columnsId);
	
	List<XtPermissionColumns> selectAll();
}
