package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerContactRecord;


public interface XsContactRecordService {
	public void addrecord(XsCustomerContactRecord record);
	public void updaterecord(XsCustomerContactRecord record);
	public void deleterecord(Long contactRecordId);
	public XsCustomerContactRecord getrecord(Long contactRecordId);
	public  PageInfo<XsCustomerContactRecord>  selectrecord(Integer pageNum,Integer pageSize,XsCustomerContactRecord record);

	
	
}
