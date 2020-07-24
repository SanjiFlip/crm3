package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerContact;


public interface XsCustomerContactService {
	public void addcontact(XsCustomerContact contact);
	public void updatecontact(XsCustomerContact contact);
	public void deletecontact(Long contactId);
	public XsCustomerContact getcontact(Long contactId);
	public  PageInfo<XsCustomerContact>  selectcontact(Integer pageNum,Integer pageSize,XsCustomerContact contact);
	
}
