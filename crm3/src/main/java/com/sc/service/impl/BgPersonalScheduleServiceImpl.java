package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.BgExamineTask;
import com.sc.entity.BgPersonalSchedule;
import com.sc.entity.BgPersonalScheduleExample;
import com.sc.entity.BgExamineTaskExample.Criteria;
import com.sc.mapper.BgPersonalScheduleMapper;
import com.sc.service.BgPersonalScheduleService;

@Service
public class BgPersonalScheduleServiceImpl implements BgPersonalScheduleService {

	@Autowired
	BgPersonalScheduleMapper bgPersonalScheduleMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addSchedule(com.sc.entity.BgPersonalSchedule schedule) {
		bgPersonalScheduleMapper.insert(schedule);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteSchedule(Long schedulePlanId) {
		if(schedulePlanId!=null){
			bgPersonalScheduleMapper.deleteByPrimaryKey(schedulePlanId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateSchedule(com.sc.entity.BgPersonalSchedule schedule) {
		if(schedule!=null&&schedule.getSchedulePlanId()!=null){
			bgPersonalScheduleMapper.updateByPrimaryKey(schedule);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public BgPersonalSchedule getSchedule(Long schedulePlanId) {
		if(schedulePlanId!=null){
			return bgPersonalScheduleMapper.selectByPrimaryKey(schedulePlanId);
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<BgPersonalSchedule> selectSchedule(Integer pageNum, Integer pageSize,
			BgPersonalSchedule schedule) {
		BgPersonalScheduleExample example=new BgPersonalScheduleExample();
		if(schedule!=null){
            com.sc.entity.BgPersonalScheduleExample.Criteria criteria = example.createCriteria();
			if(!StringUtils.isEmpty(schedule.getDatemin())){
				System.out.println("----小----"+schedule.getDatemin());
				criteria.andBeginDateGreaterThanOrEqualTo(schedule.getDatemin());
			}
			if(!StringUtils.isEmpty(schedule.getDatemax())){
				Date datemax=schedule.getDatemax();
				datemax.setHours(23);
				datemax.setMinutes(59);
				datemax.setSeconds(59);
				System.out.println("----大----"+datemax);
				criteria.andBeginDateLessThanOrEqualTo(datemax);
				
			}
		}
		
		
		PageHelper.startPage(pageNum, pageSize);
		List<BgPersonalSchedule> list =bgPersonalScheduleMapper.selectByExample(example);
		PageInfo<BgPersonalSchedule> page=new PageInfo<BgPersonalSchedule>(list);
		return page;
	}

}
