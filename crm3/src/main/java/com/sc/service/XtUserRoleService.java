package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserRole;

public interface XtUserRoleService {
	
	void addXtUserRole (XtUserRole xtUserRole);
	
	void deleteXtUserRole(Long id);
	
	void updateXtUserRole(XtUserRole xtUserRole);
	
	XtUserRole getXtUserRole(Long id);
	
	PageInfo<XtUserRole> selectXtUserRole(Integer pageNum,Integer pageSize,XtUserRole xtUserRole);
	
	List<XtUserRole> selectByUserId(Long id);
}
