package com.sc.service;

import com.sc.entity.XtPermissonRole;

public interface XtPermissionRoleService {
	
	void addXtPermissionRole(XtPermissonRole permrole);
	
	void deleteXtPermissionRole(Long permissionId,Long roleId);
}
