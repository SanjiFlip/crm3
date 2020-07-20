package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.RsUserMessage;
import com.sc.entity.RsUserMessageExample;
import com.sc.entity.RsUserMessageExample.Criteria;
import com.sc.mapper.RsUserMessageMapper;
import com.sc.service.RsUserMessageService;
@Service
public class RsUserMessageServiceImpl implements RsUserMessageService {


	@Autowired
	RsUserMessageMapper rsUserMessageMapper;
	

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addRsUser(RsUserMessage rsuser) {
		rsUserMessageMapper.insert(rsuser);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateRsUser(RsUserMessage rsuser) {
		if(rsuser!=null&&rsuser.getStaffId()!=null){
			rsUserMessageMapper.updateByPrimaryKey(rsuser);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteRsUser(Long staffId) {
		if(staffId!=null){
			rsUserMessageMapper.deleteByPrimaryKey(staffId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public RsUserMessage getRsUser(Long staffId) {
		if(staffId!=null){
			return rsUserMessageMapper.selectByPrimaryKey(staffId);
			}
			return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<RsUserMessage> selectRsCompnay(Integer pageNum, Integer pageSize, RsUserMessage rsuser) {
		RsUserMessageExample example=new RsUserMessageExample();
		
		if(rsuser!=null){
			 Criteria criteria = example.createCriteria();
			if(!StringUtils.isEmpty(rsuser.getStaffName())){
				criteria.andStaffNameLike("%"+rsuser.getStaffName()+"%");
			}
			if(!StringUtils.isEmpty(rsuser.getDatemin())){
				criteria.andLastModifyDateGreaterThanOrEqualTo(rsuser.getDatemin());
			}
			if(!StringUtils.isEmpty(rsuser.getDatemax())){
				Date d=rsuser.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
		PageHelper.startPage(pageNum, pageSize);
		List<RsUserMessage> list= rsUserMessageMapper.selectByExample(example);
		PageInfo<RsUserMessage> page=new PageInfo<RsUserMessage>(list);
		
		return page;
	}

}
