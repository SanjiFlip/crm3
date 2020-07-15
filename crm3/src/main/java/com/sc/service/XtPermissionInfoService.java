package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPermissionInfo;

public interface XtPermissionInfoService {
	
	void addInfo(XtPermissionInfo info);
	
	void deleteInfo(XtPermissionInfo info);
	
	void updateInfo(XtPermissionInfo info);
	
	PageInfo<XtPermissionInfo> selectByColumnId(Integer pageNum,Integer pageSize,Long columnsId);
	
	PageInfo<XtPermissionInfo> selectNotByColumnId(Integer pageNum,Integer pageSize,Long columnsId);
	
	XtPermissionInfo getPermInfo(Long permissonId);
	
	List<XtPermissionInfo> selectInfo();
	
	List<XtPermissionInfo> checkInfos(Long roleId);
	
	List<XtPermissionInfo> getUserPerm(Long userId);
	
	List<XtPermissionInfo> selectAllPerm();
}
