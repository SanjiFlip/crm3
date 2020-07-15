package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtLog;
import com.sc.mapper.XtLogMapper;
import com.sc.service.XtLogService;

@Service
public class XtLogServiceImpl implements XtLogService {
	
	@Autowired
	XtLogMapper xtLogMapper;
	
	/**
	 * @function 添加系统日志，切面中使用
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addXtLog(XtLog xtlog) {
		xtLogMapper.insert(xtlog);
	}
	
	/**
	 * 多条件查询
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XtLog> selectXtLog(Integer pageNum, Integer pageSize, XtLog xtlog) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtLog> list = xtLogMapper.selectBySome(xtlog);
		PageInfo<XtLog> page = new PageInfo<XtLog>(list);	
		return page;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteXtLog(Long logId) {
		if (logId!=null) {
			xtLogMapper.deleteByPrimaryKey(logId);
		}
		
	}

}
