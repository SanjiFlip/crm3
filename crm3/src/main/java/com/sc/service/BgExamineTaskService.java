package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgExamineTask;

public interface BgExamineTaskService {

	public void addTask(BgExamineTask task);
	
	public void deleteTask(Long taskId);
	
	public void updateTask(BgExamineTask task);
	
	public BgExamineTask getTask(Long taskId);
	
	public PageInfo<BgExamineTask> selectTask(Integer pageNum,Integer pageSize,BgExamineTask task);
}
