package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.BgSms;
import com.sc.entity.BgSmsDetail;
import com.sc.entity.BgSmsDetailTwo;
import com.sc.mapper.BgSmsDetailMapper;
import com.sc.service.BgSmsDetailService;

@Service
public class BgSmsDetailServiceImpl implements BgSmsDetailService {

	@Autowired
	BgSmsDetailMapper bgSmsDetailMapper;
	
	@Override
	public void addSmsdetail(BgSmsDetail smsdetail) {
		bgSmsDetailMapper.insert(smsdetail);

	}

	@Override
	public void updateSmsdetail(BgSmsDetail smsdetail) {
		if(smsdetail!=null&&smsdetail.getDetailId()!=null){
			bgSmsDetailMapper.updateByPrimaryKey(smsdetail);
		}

	}

	@Override
	public void deleteSmsdetail(Long detailId) {
		if(detailId!=null){
			bgSmsDetailMapper.deleteByPrimaryKey(detailId);
		}

	}

	@Override
	public BgSmsDetail getSmsdetail(Long detailId) {
		if(detailId!=null){
		    return bgSmsDetailMapper.selectByPrimaryKey(detailId);
		}
		return null;
	}

	@Override
	public PageInfo<BgSmsDetail> selectSmsdetail(Integer pageNum, Integer pageSize, BgSmsDetail smsdetail) {
		PageHelper.startPage(pageNum, pageSize);
		List<BgSmsDetail> list = bgSmsDetailMapper.selectByExample(null);
		PageInfo<BgSmsDetail> page=new PageInfo<BgSmsDetail>(list);
		return page;
	}

	@Override
	public PageInfo<BgSmsDetailTwo> selectSmsDetailByName(Integer pageNum,Integer pageSize,Long recipientId) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<BgSmsDetailTwo> list = bgSmsDetailMapper.selectSmsDetailByName(recipientId);
		PageInfo<BgSmsDetailTwo> page = new PageInfo<BgSmsDetailTwo>(list);
		return page;
	}

}
