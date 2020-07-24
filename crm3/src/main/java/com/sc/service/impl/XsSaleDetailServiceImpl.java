package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustomerInfo;
import com.sc.entity.XsCustomerInfoExample;
import com.sc.entity.XsSaleDetail;
import com.sc.entity.XsSaleDetailExample;
import com.sc.entity.XsCustomerInfoExample.Criteria;
import com.sc.mapper.XsCustomerInfoMapper;
import com.sc.mapper.XsSaleDetailMapper;
import com.sc.service.XsSaleDetailService;
@Service
public class XsSaleDetailServiceImpl implements XsSaleDetailService {

	@Autowired 
	XsSaleDetailMapper xsDetailMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void adddetail(XsSaleDetail detail) {
		// TODO Auto-generated method stub
		xsDetailMapper.insert(detail);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updatedetail(XsSaleDetail detail) {
		// TODO Auto-generated method stub
		 if(detail!=null&&detail.getSalesDetailId()!=null){
			 xsDetailMapper.updateByPrimaryKey(detail);      	
	        }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deletedetail(Long salesDetailId) {
		// TODO Auto-generated method stub
		if(salesDetailId!=null){
			xsDetailMapper.deleteByPrimaryKey(salesDetailId);
        }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public XsSaleDetail getdetail(Long salesDetailId) {
		// TODO Auto-generated method stub
		if(salesDetailId!=null){
			return xsDetailMapper.selectByPrimaryKey(salesDetailId);
        }	
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<XsSaleDetail> selectdetail(Integer pageNum, Integer pageSize, XsSaleDetail detail) {
		// TODO Auto-generated method stub
		XsSaleDetailExample example=new XsSaleDetailExample();
		if(detail!=null){
			com.sc.entity.XsSaleDetailExample.Criteria criteria = example.createCriteria();		
			if(!StringUtils.isEmpty(detail.getSalesId())){			
				criteria.andSalesIdEqualTo(detail.getSalesId());		
			}
			if(!StringUtils.isEmpty(detail.getDatemin())){//最后修改时间大于等于最小日期
				System.out.println("----小----"+detail.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(detail.getDatemin());				
			}
			if(!StringUtils.isEmpty(detail.getDatemax())){//最后修改时间小于等于最大日期
				Date d=detail.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("----大----"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
	
			
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);		
		List<XsSaleDetail> list=xsDetailMapper.selectByExample(example);
		PageInfo<XsSaleDetail> page=new PageInfo<XsSaleDetail>(list);
		return page;
	}

}
