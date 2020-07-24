package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsSaleDeliveryList;
import com.sc.entity.XsSaleDetail;

public interface XsSaleListService {
	public void addsalelist(XsSaleDeliveryList salelist);
	public void updatesalelist(XsSaleDeliveryList salelist);
	public void deletesalelist(Long salesId);
	public XsSaleDeliveryList getsalelist(Long salesId);
	public  PageInfo<XsSaleDeliveryList>  selectsalelist(Integer pageNum,Integer pageSize,XsSaleDeliveryList salelist);
}
