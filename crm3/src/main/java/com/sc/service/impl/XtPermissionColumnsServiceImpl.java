package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPermissionColumns;
import com.sc.mapper.XtPermissionColumnsMapper;
import com.sc.service.XtPermissionColumnsService;

@Service
public class XtPermissionColumnsServiceImpl implements XtPermissionColumnsService {
	
	@Autowired
	XtPermissionColumnsMapper xtPermissionColumnsMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addColumns(XtPermissionColumns xpc) {
		if (xpc!=null) {
			xtPermissionColumnsMapper.insert(xpc);
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateColumns(XtPermissionColumns xpc) {
		if (xpc.getColumnsId()!=null) {
			xtPermissionColumnsMapper.updateByPrimaryKey(xpc);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteColumns(Long columnsId) {
		if (columnsId!=null) {
			xtPermissionColumnsMapper.deleteByPrimaryKey(columnsId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XtPermissionColumns> selectPermColumns(Integer pageNum, Integer pageSize, XtPermissionColumns xpc) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtPermissionColumns> list = xtPermissionColumnsMapper.selectByExample(null);
		PageInfo<XtPermissionColumns> page = new PageInfo<XtPermissionColumns>(list);
		return page;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public XtPermissionColumns getColumns(Long columnsId) {
		XtPermissionColumns columns = xtPermissionColumnsMapper.selectByPrimaryKey(columnsId);
		return columns;
	}

	@Override
	public List<XtPermissionColumns> selectAll() {
		List<XtPermissionColumns> list = xtPermissionColumnsMapper.selectByExample(null);
		return list;
	}

}
