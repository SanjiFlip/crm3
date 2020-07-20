package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtRoles;

public interface XtRoleService {
	
	void addXtRole(XtRoles xtRole);
	
	void deleteXtRole(Long roleId);
	
	void updateXtRole(XtRoles xtRole);
	
	PageInfo<XtRoles> selectXtRoles(Integer pageNum,Integer pageSize,XtRoles xtRole);
	
	XtRoles getXtRoles(Long roleId);
	
	List<XtRoles> selectAllRole();
}
