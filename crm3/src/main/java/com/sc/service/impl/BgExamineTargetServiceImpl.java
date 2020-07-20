package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.BgExamineTarget;
import com.sc.entity.BgExamineTargetExample;
import com.sc.mapper.BgExamineTargetMapper;
import com.sc.service.BgExamineTargetService;

@Service
public class BgExamineTargetServiceImpl implements BgExamineTargetService {

	@Autowired
	BgExamineTargetMapper bgExamineTargetMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addTarget(BgExamineTarget target) {
		bgExamineTargetMapper.insert(target);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateTarget(BgExamineTarget target) {
		if(target!=null&&target.getTargetId()!=null){
			bgExamineTargetMapper.updateByPrimaryKey(target);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteTarget(Long targetId) {
		if(targetId!=null){
			bgExamineTargetMapper.deleteByPrimaryKey(targetId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public BgExamineTarget getTarget(Long targetId) {
		if(targetId!=null){
		    return bgExamineTargetMapper.selectByPrimaryKey(targetId);
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<BgExamineTarget> selectTarget(Integer pageNum, Integer pageSize, BgExamineTarget target) {
		BgExamineTargetExample example=new BgExamineTargetExample();
		if(target!=null){
			com.sc.entity.BgExamineTargetExample.Criteria criteria = example.createCriteria();
			if(!StringUtils.isEmpty(target.getExamineTarget())){
				criteria.andExamineTargetLike("%"+target.getExamineTarget()+"%");
			}
			if(!StringUtils.isEmpty(target.getDatemin())){
				System.out.println("----灏�----"+target.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(target.getDatemin());
			}
			if(!StringUtils.isEmpty(target.getDatemax())){
				Date datemax=target.getDatemax();
				datemax.setHours(23);
				datemax.setMinutes(59);
				datemax.setSeconds(59);
				System.out.println("----澶�----"+datemax);
				criteria.andLastModifyDateLessThanOrEqualTo(datemax);
				
			}
		}
		
		PageHelper.startPage(pageNum, pageSize);
		List<BgExamineTarget> list = bgExamineTargetMapper.selectByExample(example);
		PageInfo<BgExamineTarget> page=new PageInfo<BgExamineTarget>(list);
		return page;
	}

}
