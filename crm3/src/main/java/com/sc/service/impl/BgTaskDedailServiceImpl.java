package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.BgTaskDedail;
import com.sc.entity.BgTaskDedailExample;
import com.sc.entity.BgTaskDedailExample.Criteria;
import com.sc.entity.BgTaskDedailTwo;
import com.sc.mapper.BgTaskDedailMapper;
import com.sc.service.BgTaskDedailService;

@Service
public class BgTaskDedailServiceImpl implements BgTaskDedailService {

	@Autowired
	BgTaskDedailMapper bgTaskDedailMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addDedail(BgTaskDedail dedail) {
		bgTaskDedailMapper.insert(dedail);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteDedail(Long bhId) {
		bgTaskDedailMapper.deleteByPrimaryKey(bhId);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateDedail(BgTaskDedail dedail) {
		if(dedail!=null&&dedail.getBhId()!=null){
			bgTaskDedailMapper.updateByPrimaryKey(dedail);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public BgTaskDedail getDedail(Long bhId) {
		if(bhId!=null){
			return bgTaskDedailMapper.selectByPrimaryKey(bhId);
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<BgTaskDedail> selectDedail(Integer pageNum, Integer pageSize, BgTaskDedail dedail) {
		BgTaskDedailExample example=new BgTaskDedailExample();
		if(dedail!=null){
			Criteria criteria = example.createCriteria();
			if(!StringUtils.isEmpty(dedail.getWhetherFinish())){
				criteria.andWhetherFinishLike("%"+dedail.getWhetherFinish()+"%");
			}
		}
		
		PageHelper.startPage(pageNum, pageSize);
		List<BgTaskDedail> list =bgTaskDedailMapper.selectByExample(example);
		PageInfo<BgTaskDedail> page=new PageInfo<BgTaskDedail>(list);
		return page;
	}

	@Override
	public void deleteByTaskId(Long taskId) {
		// TODO Auto-generated method stub
		 bgTaskDedailMapper.deleteByTaskId(taskId);
	}

	@Override
	public void updateBywhetherFinish(BgTaskDedail dedail) {
		// TODO Auto-generated method stub
		bgTaskDedailMapper.updateByWhetherFinish(dedail);
	}

	@Override
	public void updateByState(BgTaskDedail dedail) {
		// TODO Auto-generated method stub
		bgTaskDedailMapper.updateByState(dedail);
	}

	@Override
	public PageInfo<BgTaskDedailTwo> selectTaskDedailById(Integer pageNum, Integer pageSize, Long acceptUserId) {
		// TODO Auto-generated method stub
		List<BgTaskDedailTwo> list =bgTaskDedailMapper.selectTaskDedailById(acceptUserId);
		PageInfo<BgTaskDedailTwo> page=new PageInfo<BgTaskDedailTwo>(list);
		return page;
	}

}
