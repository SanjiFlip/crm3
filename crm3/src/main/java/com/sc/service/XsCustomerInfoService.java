package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerInfo;

public interface XsCustomerInfoService {	
	public void addcustomer(XsCustomerInfo customer);
	public void updatecustomer(XsCustomerInfo customer);
	public void deletecustomer(Long customerId);
	public XsCustomerInfo getcustomer(Long customerId);
	public  PageInfo<XsCustomerInfo>  selectcustomer(Integer pageNum,Integer pageSize,XsCustomerInfo customer);
}
