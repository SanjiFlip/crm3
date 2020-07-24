package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerContact;
import com.sc.entity.XsCustomerContactExample;
import com.sc.entity.XsCustomerInfo;
import com.sc.entity.XsCustomerInfoExample;
import com.sc.entity.XsCustomerInfoExample.Criteria;
import com.sc.mapper.XsCustomerContactMapper;
import com.sc.mapper.XsCustomerInfoMapper;
import com.sc.service.XsCustomerContactService;

@Service
public class XsCustomerContactServiceImpl implements XsCustomerContactService {
 
	@Autowired
	XsCustomerContactMapper xsContactMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addcontact(XsCustomerContact contact) {
		// TODO Auto-generated method stub
		xsContactMapper.insert(contact);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updatecontact(XsCustomerContact contact) {
		// TODO Auto-generated method stub
		if(contact!=null&&contact.getContactId()!=null){
			xsContactMapper.updateByPrimaryKey(contact);      	
        }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deletecontact(Long contactId) {
		// TODO Auto-generated method stub
		if(contactId!=null){
			xsContactMapper.deleteByPrimaryKey(contactId);
        }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public XsCustomerContact getcontact(Long contactId) {
		// TODO Auto-generated method stub
		if(contactId!=null){
			return xsContactMapper.selectByPrimaryKey(contactId);
        }
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XsCustomerContact> selectcontact(Integer pageNum, Integer pageSize, XsCustomerContact contact) {
		// TODO Auto-generated method stub
		XsCustomerContactExample example=new XsCustomerContactExample();
		if(contact!=null){ 
			com.sc.entity.XsCustomerContactExample.Criteria criteria = example.createCriteria();		
			if(!StringUtils.isEmpty(contact.getCustomerId())){			
				criteria.andCustomerIdEqualTo(contact.getCustomerId());		
			}
			if(!StringUtils.isEmpty(contact.getContactName())){			
				criteria.andContactNameLike("%"+contact.getContactName()+"%");			
			}
			if(!StringUtils.isEmpty(contact.getDatemin())){//最后修改时间大于等于最小日期
				System.out.println("----小----"+contact.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(contact.getDatemin());				
			}
			if(!StringUtils.isEmpty(contact.getDatemax())){//最后修改时间小于等于最大日期
				Date d=contact.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("----大----"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		
	    }
			PageHelper.startPage(pageNum,pageSize);
			
			List<XsCustomerContact> list=xsContactMapper.selectByExample(example);
			PageInfo<XsCustomerContact> page=new PageInfo<XsCustomerContact>(list);
			return page;
	        
	}
	
}
