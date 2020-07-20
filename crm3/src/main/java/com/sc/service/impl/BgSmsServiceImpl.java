package com.sc.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.BgExamineTarget;
import com.sc.entity.BgSms;
import com.sc.mapper.BgSmsMapper;
import com.sc.service.BgSmsService;

@Service
public class BgSmsServiceImpl implements BgSmsService {

	@Autowired
	BgSmsMapper bgSmsMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addSms(BgSms sms) {
		bgSmsMapper.insert(sms);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateSms(BgSms sms) {
		if(sms!=null&&sms.getBhId()!=null){
			bgSmsMapper.updateByPrimaryKey(sms);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteSms(Long bhId) {
		if(bhId!=null){
			bgSmsMapper.deleteByPrimaryKey(bhId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public BgSms getSms(Long bhId) {
		if(bhId!=null){
		    return bgSmsMapper.selectByPrimaryKey(bhId);
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<BgSms> selectSms(Integer pageNum, Integer pageSize, BgSms sms) {
		PageHelper.startPage(pageNum, pageSize);
		List<BgSms> list = bgSmsMapper.selectByExample(null);
		Iterator<BgSms> iterator = list.iterator();

		while(iterator.hasNext()){
			if(!sms.getSendPerson().equals(iterator.next().getSendPerson())){
				iterator.remove();
				
			}
		}
		PageInfo<BgSms> page=new PageInfo<BgSms>(list);
		return page;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<BgSms> selectSmsByName(Integer pageNum, Integer pageSize, String sendPerson) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<BgSms> list = bgSmsMapper.selectSmsByName(sendPerson);
		PageInfo<BgSms> page=new PageInfo<BgSms>(list);
		return page;
	}

	
}
