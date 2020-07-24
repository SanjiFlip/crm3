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
import com.sc.entity.XsCustomerFeedback;
import com.sc.entity.XsCustomerFeedbackExample;
import com.sc.entity.XsCustomerFeedbackExample.Criteria;
import com.sc.mapper.XsCustomerContactMapper;
import com.sc.mapper.XsCustomerFeedbackMapper;
import com.sc.service.XsCustomerFeedbackService;
@Service
public class XsCustomerFeedbackServiceImpl implements XsCustomerFeedbackService {
	@Autowired
	XsCustomerFeedbackMapper xsFeedbackMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addfeedback(XsCustomerFeedback feedback) {
		// TODO Auto-generated method stub
		xsFeedbackMapper.insert(feedback);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updatefeedback(XsCustomerFeedback feedback) {
		// TODO Auto-generated method stub
		if(feedback!=null&&feedback.getFeedbackRecordId()!=null){
			xsFeedbackMapper.updateByPrimaryKey(feedback);      	
        }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deletefeedback(Long feedbackRecordId) {
		// TODO Auto-generated method stub
		if(feedbackRecordId!=null){
			xsFeedbackMapper.deleteByPrimaryKey(feedbackRecordId);
        }
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public XsCustomerFeedback getfeedback(Long feedbackRecordId) {
		// TODO Auto-generated method stub
		if(feedbackRecordId!=null){
			return xsFeedbackMapper.selectByPrimaryKey(feedbackRecordId);
        }	
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public  PageInfo<XsCustomerFeedback> selectfeedback(Integer pageNum, Integer pageSize, XsCustomerFeedback feedback) {
		// TODO Auto-generated method stub
		XsCustomerFeedbackExample example=new XsCustomerFeedbackExample();
		if(feedback!=null){ 
			Criteria criteria = example.createCriteria();	
			if(!StringUtils.isEmpty(feedback.getCustomerId())){			
				criteria.andCustomerIdEqualTo(feedback.getCustomerId());		
			}
			if(!StringUtils.isEmpty(feedback.getRecordPriority())){	
				criteria.andRecordPriorityLike("%"+feedback.getRecordPriority()+"%");
			}
			if(!StringUtils.isEmpty(feedback.getDatemin())){//最后修改时间大于等于最小日期
				System.out.println("----小----"+feedback.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(feedback.getDatemin());				
			}
			if(!StringUtils.isEmpty(feedback.getDatemax())){//最后修改时间小于等于最大日期
				Date d=feedback.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("----大----"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		
	    }
			PageHelper.startPage(pageNum,pageSize);
			
			List<XsCustomerFeedback> list=xsFeedbackMapper.selectByExample(example);
			PageInfo<XsCustomerFeedback> page=new PageInfo<XsCustomerFeedback>(list);
			return page;
	        
	}

}
