package com.sc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sc.entity.XtPermissonRole;
import com.sc.entity.XtPermissonRoleExample;
import com.sc.entity.XtPermissonRoleExample.Criteria;
import com.sc.mapper.XtPermissonRoleMapper;

@Service
public class XtPermissionRoleServiceImpl implements com.sc.service.XtPermissionRoleService {
	
	@Autowired
	XtPermissonRoleMapper xtPermissonRoleMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addXtPermissionRole(XtPermissonRole permrole) {
		xtPermissonRoleMapper.insert(permrole);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteXtPermissionRole(Long permissionId,Long roleId) {
		XtPermissonRoleExample example = new XtPermissonRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		criteria.andPermissonIdEqualTo(permissionId);
		xtPermissonRoleMapper.deleteByExample(example);

	}

}
