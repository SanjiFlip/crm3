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
import com.sc.entity.BgExamineTaskExample;
import com.sc.entity.BgExamineTaskExample.Criteria;
import com.sc.entity.BgTaskDedail;
import com.sc.mapper.BgExamineTaskMapper;
import com.sc.mapper.BgTaskDedailMapper;
import com.sc.service.BgExamineTaskService;

@Service
public class BgExamineTaskServiceImpl implements BgExamineTaskService {

	@Autowired
	BgExamineTaskMapper bgExamineTaskMapper;
	
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addTask(BgExamineTask task) {
	 	bgExamineTaskMapper.insert(task);
	 	System.out.println(task.getTaskId()+"&&&&&&&&&&&&&&&&&&&&&&");
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteTask(Long taskId) {
		if(taskId!=null){
			bgExamineTaskMapper.deleteByPrimaryKey(taskId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateTask(BgExamineTask task) {
		if(task!=null&&task.getTaskId()!=null){
			bgExamineTaskMapper.updateByPrimaryKey(task);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public BgExamineTask getTask(Long taskId) {
		if(taskId!=null){
		    return bgExamineTaskMapper.selectByPrimaryKey(taskId);
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<BgExamineTask> selectTask(Integer pageNum, Integer pageSize, BgExamineTask task) {
		BgExamineTaskExample example=new BgExamineTaskExample();
		if(task!=null){
            Criteria criteria = example.createCriteria();
			if(!StringUtils.isEmpty(task.getTaskTitle())){
				criteria.andTaskTitleLike("%"+task.getTaskTitle()+"%");
			}
			if(!StringUtils.isEmpty(task.getDatemin())){
				System.out.println("----小----"+task.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(task.getDatemin());
			}
			if(!StringUtils.isEmpty(task.getDatemax())){
				Date datemax=task.getDatemax();
				datemax.setHours(23);
				datemax.setMinutes(59);
				datemax.setSeconds(59);
				System.out.println("----大----"+datemax);
				criteria.andLastModifyDateLessThanOrEqualTo(datemax);
				
			}
		}
		
		PageHelper.startPage(pageNum, pageSize);
		List<BgExamineTask> list =bgExamineTaskMapper.selectByExample(example);
		PageInfo<BgExamineTask> page=new PageInfo<BgExamineTask>(list);
		return page;
	}

}
