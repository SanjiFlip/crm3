package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgPersonalSchedule;

public interface BgPersonalScheduleService {

	public void addSchedule(BgPersonalSchedule schedule);
	
	public void deleteSchedule(Long schedulePlanId);
	
	public void updateSchedule(BgPersonalSchedule schedule);

    public BgPersonalSchedule getSchedule(Long schedulePlanId);
    
    public PageInfo<BgPersonalSchedule> selectSchedule(Integer pageNum,Integer pageSize, BgPersonalSchedule schedule);

}