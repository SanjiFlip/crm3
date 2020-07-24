package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPermissionInfo;
import com.sc.mapper.XtPermissionInfoMapper;
import com.sc.service.XtPermissionInfoService;


@Service
public class XtPermissionInfoServiceImpl implements XtPermissionInfoService {
	
	@Autowired
	XtPermissionInfoMapper xtPermissionInfoMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addInfo(XtPermissionInfo info) {
		if (info!=null) {
			xtPermissionInfoMapper.insert(info);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteInfo(XtPermissionInfo info) {
		if (info.getPermissonId()!=null) {
			xtPermissionInfoMapper.deleteByPrimaryKey(info.getPermissonId());
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateInfo(XtPermissionInfo info) {
		if (info.getPermissonId()!=null) {
			System.out.println("修改的权限信息ID是"+info.getPermissonId());
			xtPermissionInfoMapper.updateByPrimaryKey(info);
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XtPermissionInfo> selectByColumnId(Integer pageNum, Integer pageSize, Long columnsId) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtPermissionInfo> list = xtPermissionInfoMapper.selectByColumnId(columnsId);
		PageInfo<XtPermissionInfo> page = new PageInfo<XtPermissionInfo>(list);
		return page;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XtPermissionInfo> selectNotByColumnId(Integer pageNum, Integer pageSize, Long columnsId) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtPermissionInfo> list = xtPermissionInfoMapper.selectNotByColumnId(columnsId);
		PageInfo<XtPermissionInfo> page = new PageInfo<XtPermissionInfo>(list);
		return page;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public XtPermissionInfo getPermInfo(Long permissonId) {
		if (permissonId!=null) {
			XtPermissionInfo info = xtPermissionInfoMapper.selectByPrimaryKey(permissonId);
			return info;
		}else {
			return null;
		}	
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<XtPermissionInfo> selectInfo() {
		List<XtPermissionInfo> list = xtPermissionInfoMapper.selectInfo();
		return list;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<XtPermissionInfo> checkInfos(Long roleId) {
		List<XtPermissionInfo> list = xtPermissionInfoMapper.checkInfos(roleId);
		if(list!=null&&list.size()>0) {
			return list;
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<XtPermissionInfo> getUserPerm(Long userId) {
		List<XtPermissionInfo> permissionForUser = xtPermissionInfoMapper.getPermissionForUser(userId);
		return permissionForUser;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<XtPermissionInfo> selectAllPerm() {
		List<XtPermissionInfo> list = xtPermissionInfoMapper.selectByExample(null);
		return list;
	}

}
