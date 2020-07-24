package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerFeedback;


public interface XsCustomerFeedbackService {
	public void addfeedback(XsCustomerFeedback feedback);
	public void updatefeedback(XsCustomerFeedback feedback);
	public void deletefeedback(Long feedbackRecordId);
	public XsCustomerFeedback getfeedback(Long feedbackRecordId);
	public PageInfo<XsCustomerFeedback>  selectfeedback(Integer pageNum,Integer pageSize,XsCustomerFeedback feedback); 
	// TODO Auto-generated method stub	
}
