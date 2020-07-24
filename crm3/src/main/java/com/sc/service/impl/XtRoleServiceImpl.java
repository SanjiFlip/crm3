package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtRoles;
import com.sc.mapper.XtRolesMapper;
import com.sc.service.XtRoleService;

/**
 * 
 * @author Sanji
 *	@function ϵͳ��ɫ
 */
@Service
public class XtRoleServiceImpl implements XtRoleService {
	
	@Autowired
	XtRolesMapper xtRolesMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addXtRole(XtRoles xtRole) {
		if (xtRole!=null) {
			xtRolesMapper.insert(xtRole);
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteXtRole(Long roleId) {
		if (roleId!=null) {
			xtRolesMapper.deleteByPrimaryKey(roleId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateXtRole(XtRoles xtRole) {
		if (xtRole!=null&&xtRole.getRoleId()!=null) {
			xtRolesMapper.updateByPrimaryKey(xtRole);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XtRoles> selectXtRoles(Integer pageNum, Integer pageSize, XtRoles xtRole) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtRoles> list = xtRolesMapper.selectUpName();
		PageInfo<XtRoles> page = new PageInfo<XtRoles>(list);
		return page;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public XtRoles getXtRoles(Long roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<XtRoles> selectAllRole() {
		List<XtRoles> list = xtRolesMapper.selectUpName();
		return list;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public XtRoles getXtRplesByUserId(Long userId) {
		XtRoles role = xtRolesMapper.getRoleByUserId(userId);
		return role;
	}

}
