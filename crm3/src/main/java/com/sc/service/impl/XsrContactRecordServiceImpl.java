package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerContactRecord;
import com.sc.entity.XsCustomerContactRecordExample;
import com.sc.mapper.XsCustomerContactRecordMapper;
import com.sc.service.XsContactRecordService;
@Service
public class XsrContactRecordServiceImpl implements XsContactRecordService {
	
	@Autowired
	XsCustomerContactRecordMapper xsContactRecordMapper;
	
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addrecord(XsCustomerContactRecord record) {
		// TODO Auto-generated method stub
		xsContactRecordMapper.insert(record);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updaterecord(XsCustomerContactRecord record) {
		// TODO Auto-generated method stub
		 if(record!=null&&record.getContactRecordId()!=null){
			 xsContactRecordMapper.updateByPrimaryKey(record);      	
	        }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleterecord(Long contactRecordId) {
		// TODO Auto-generated method stub
		if(contactRecordId!=null){
			xsContactRecordMapper.deleteByPrimaryKey(contactRecordId);
        }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public XsCustomerContactRecord getrecord(Long contactRecordId) {
		// TODO Auto-generated method stub
		if(contactRecordId!=null){
			return xsContactRecordMapper.selectByPrimaryKey(contactRecordId);
        }	
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XsCustomerContactRecord> selectrecord(Integer pageNum, Integer pageSize,
			XsCustomerContactRecord record) {
		// TODO Auto-generated method stub
		XsCustomerContactRecordExample example=new XsCustomerContactRecordExample();
		if(record!=null){
			com.sc.entity.XsCustomerContactRecordExample.Criteria criteria = example.createCriteria();	
			if(!StringUtils.isEmpty(record.getCustomerId())){			
				criteria.andCustomerIdEqualTo(record.getCustomerId());		
			}
			if(!StringUtils.isEmpty(record.getContactHeading())){
				System.out.println("----小----"+record.getContactHeading());
				criteria.andContactHeadingLike("%"+record.getContactHeading()+"%");
			}
			if(!StringUtils.isEmpty(record.getDatemin())){//最后修改时间大于等于最小日期
				System.out.println("----小----"+record.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(record.getDatemin());				
			}
			if(!StringUtils.isEmpty(record.getDatemax())){//最后修改时间小于等于最大日期
				Date d=record.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("----大----"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
	
		
		
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);
		
		List<XsCustomerContactRecord> list=xsContactRecordMapper.selectByExample(example);
		PageInfo<XsCustomerContactRecord> page=new PageInfo<XsCustomerContactRecord>(list);
		return page;
	}

}
