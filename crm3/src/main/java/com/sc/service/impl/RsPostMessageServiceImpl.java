package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.RsPostMessage;
import com.sc.entity.RsPostMessageExample;
import com.sc.entity.RsPostMessageExample.Criteria;
import com.sc.mapper.RsDepartmentMapper;
import com.sc.mapper.RsPostMessageMapper;
import com.sc.service.RsPostMessageService;

@Service
public class RsPostMessageServiceImpl implements RsPostMessageService {
	

	@Autowired
	RsPostMessageMapper rsPostMessageMapper;
	
	@Autowired
	RsDepartmentMapper rsDepartmentMapper;
	

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addRsPost(RsPostMessage rspost) {
		rsPostMessageMapper.insert(rspost);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateRsPost(RsPostMessage rspost) {
		if(rspost!=null&&rspost.getPostId()!=null){
			rsPostMessageMapper.updateByPrimaryKey(rspost);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteRsPost(Long postId) {
		if(postId!=null){
			rsPostMessageMapper.deleteByPrimaryKey(postId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public RsPostMessage getRsPost(Long postId) {
		if(postId!=null){
			return rsPostMessageMapper.selectByPrimaryKey(postId);
			}
			return null;
			
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<RsPostMessage> selectRsPost(Integer pageNum, Integer pageSize, RsPostMessage rspost) {
		RsPostMessageExample example=new RsPostMessageExample();
		if(rspost!=null){
			 Criteria criteria = example.createCriteria();
			if(!StringUtils.isEmpty(rspost.getPostName())){
				criteria.andPostNameLike("%"+rspost.getPostName()+"%");
			}
			if(!StringUtils.isEmpty(rspost.getDatemin())){
				criteria.andLastModifyDateGreaterThanOrEqualTo(rspost.getDatemin());
			}
			if(!StringUtils.isEmpty(rspost.getDatemax())){
				Date d=rspost.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
		PageHelper.startPage(pageNum, pageSize);
		List<RsPostMessage> list= rsPostMessageMapper.selectByExample(example);
		PageInfo<RsPostMessage> page=new PageInfo<RsPostMessage>(list);
		return page;
	}	
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<RsPostMessage> selectPost() {
		List<RsPostMessage> list = rsPostMessageMapper.selectByExample(null);
		return list;
	}
	

}
