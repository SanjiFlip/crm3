package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgSmsDetail;
import com.sc.entity.BgSmsDetailTwo;

public interface BgSmsDetailService {

    public void addSmsdetail(BgSmsDetail smsdetail);
	
	public void updateSmsdetail(BgSmsDetail smsdetail);
	
	public void deleteSmsdetail(Long detailId);
	
	public  PageInfo<BgSmsDetailTwo> selectSmsDetailByName(Integer pageNum,Integer pageSize,Long recipientId);
	
	public BgSmsDetail getSmsdetail(Long detailId);
	
	public PageInfo<BgSmsDetail> selectSmsdetail(Integer pageNum,Integer pageSize, BgSmsDetail smsdetail);
}
