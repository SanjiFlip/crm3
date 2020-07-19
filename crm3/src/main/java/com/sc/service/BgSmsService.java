package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgSms;

public interface BgSmsService {

    public void addSms(BgSms sms);
	
	public void updateSms(BgSms sms);
	
	public void deleteSms(Long bhId);
	
	public BgSms getSms(Long bhId);
	
	public PageInfo<BgSms> selectSms(Integer pageNum,Integer pageSize, BgSms sms);
	
	public PageInfo<BgSms> selectSmsByName(Integer pageNum,Integer pageSize,String sendPerson);
}
