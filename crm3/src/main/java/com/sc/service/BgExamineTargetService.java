package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgExamineTarget;

public interface BgExamineTargetService {

	public void addTarget(BgExamineTarget target);
	
	public void updateTarget(BgExamineTarget target);
	
	public void deleteTarget(Long targetId);
	
	public BgExamineTarget getTarget(Long targetId);
	
	public PageInfo<BgExamineTarget> selectTarget(Integer pageNum,Integer pageSize, BgExamineTarget target);
}
