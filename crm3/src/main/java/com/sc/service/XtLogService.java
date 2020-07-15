package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtLog;

public interface XtLogService {
	
	void addXtLog(XtLog xtlog);
	
	PageInfo<XtLog> selectXtLog(Integer pageNum,Integer pageSize,XtLog xtlog);
	
	void deleteXtLog(Long logId);
}
