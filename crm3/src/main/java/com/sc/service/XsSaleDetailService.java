package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerInfo;
import com.sc.entity.XsSaleDetail;

public interface XsSaleDetailService {
	public void adddetail(XsSaleDetail detail);
	public void updatedetail(XsSaleDetail detail);
	public void deletedetail(Long salesDetailId);
	public XsSaleDetail getdetail(Long salesDetailId);
	public  PageInfo<XsSaleDetail>  selectdetail(Integer pageNum,Integer pageSize,XsSaleDetail detail);
}
