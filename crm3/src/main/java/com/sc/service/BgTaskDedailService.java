package com.sc.service;


import com.github.pagehelper.PageInfo;
import com.sc.entity.BgTaskDedail;
import com.sc.entity.BgTaskDedailTwo;


public interface BgTaskDedailService {

	public void addDedail(BgTaskDedail dedail);
	
	public void deleteDedail(Long bhId);
	
	public void deleteByTaskId(Long taskId);
	
	public void updateDedail(BgTaskDedail dedail);
	
    public BgTaskDedail getDedail(Long bhId);
    public  PageInfo<BgTaskDedailTwo> selectTaskDedailById(Integer pageNum,Integer pageSize,Long acceptUserId);
	
	public PageInfo<BgTaskDedail> selectDedail(Integer pageNum,Integer pageSize,BgTaskDedail dedail);
	
   public void updateBywhetherFinish(BgTaskDedail dedail);
   
   public void updateByState(BgTaskDedail dedail);
}
