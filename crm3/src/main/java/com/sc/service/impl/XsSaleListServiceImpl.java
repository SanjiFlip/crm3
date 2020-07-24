package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsSaleDeliveryList;
import com.sc.entity.XsSaleDeliveryListExample;
import com.sc.entity.XsSaleDeliveryListExample.Criteria;
import com.sc.mapper.XsSaleDeliveryListMapper;
import com.sc.service.XsSaleListService;
@Service
public class XsSaleListServiceImpl implements XsSaleListService {


	@Autowired 
	XsSaleDeliveryListMapper xsListMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addsalelist(XsSaleDeliveryList salelist) {
		// TODO Auto-generated method stub
		xsListMapper.insert(salelist);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updatesalelist(XsSaleDeliveryList salelist) {
		// TODO Auto-generated method stub
		if(salelist!=null&&salelist.getSalesId()!=null){
			xsListMapper.updateByPrimaryKey(salelist);      	
	        }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deletesalelist(Long salesId) {
		// TODO Auto-generated method stub
		if(salesId!=null){
			xsListMapper.deleteByPrimaryKey(salesId);
        }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public XsSaleDeliveryList getsalelist(Long salesId) {
		// TODO Auto-generated method stub
		if(salesId!=null){
			return xsListMapper.selectByPrimaryKey(salesId);
        }	
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XsSaleDeliveryList> selectsalelist(Integer pageNum, Integer pageSize, XsSaleDeliveryList salelist) {
		// TODO Auto-generated method stub
		XsSaleDeliveryListExample example=new XsSaleDeliveryListExample();
		if(salelist!=null){
			Criteria criteria = example.createCriteria();					
			if(!StringUtils.isEmpty(salelist.getDatemax())){//最后修改时间小于等于最大日期
				Date d=salelist.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("----大----"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
	
			
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);		
		List<XsSaleDeliveryList> list=xsListMapper.selectByExample(example);
		PageInfo<XsSaleDeliveryList> page=new PageInfo<XsSaleDeliveryList>(list);
		return page;
	}

}
