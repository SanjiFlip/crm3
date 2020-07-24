package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerLose;

public interface XsCustomerLoseService {
	
		public void updatelose(XsCustomerLose lose);
		public void deletelose(Long loseId);
		public XsCustomerLose getlose(Long loseId);
		public  PageInfo<XsCustomerLose>  selectlose(Integer pageNum,Integer pageSize,XsCustomerLose lose);
	
}
