package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.KcDepositoryInformation;
import com.sc.entity.KcDepositoryInformationExample;
import com.sc.entity.KcGoodsInformationExample;
import com.sc.entity.KcGoodsInformationExample.Criteria;
import com.sc.mapper.KcDepositoryInformationMapper;
import com.sc.service.KcDepositoryInformationService;
@Service
public class KcDepoInforServiceImpl implements KcDepositoryInformationService {
	
	@Autowired
	KcDepositoryInformationMapper kcdepoinfo;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addDept(KcDepositoryInformation dept) {
		kcdepoinfo.insert(dept);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteDept(Long depositoryId ) {
		if(depositoryId!=null){
		kcdepoinfo.deleteByPrimaryKey(depositoryId);
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateDept(KcDepositoryInformation dept) {
		if(dept!=null&&dept.getDepositoryId()!=null){
			kcdepoinfo.updateByPrimaryKey(dept);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public KcDepositoryInformation getDept(Long depositoryId) {
		if(depositoryId!=null){
		return this.kcdepoinfo.selectByPrimaryKey(depositoryId);
	        }
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<KcDepositoryInformation> selectDept(KcDepositoryInformation dept, Integer pageNum,
			Integer pageSize) {
		
		KcDepositoryInformationExample example = new KcDepositoryInformationExample();
		if(dept!=null){
			com.sc.entity.KcDepositoryInformationExample.Criteria criteria = example.createCriteria();
			//判断名字是否为空
			if(!StringUtils.isEmpty(dept.getDepositoryName())){
				System.out.println("QQQQQQ");
				criteria.andDepositoryNameLike("%"+dept.getDepositoryName()+"%");
				System.out.println("HHHHHH");
			}
			
			
			//判断最小的日期是否为空
			if(!StringUtils.isEmpty(dept.getDatemin())){//最后修改时间大于等于最小时间
				System.out.println("@@@@"+dept.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(dept.getDatemin());
			} 
			
			if(!StringUtils.isEmpty(dept.getDatemax())){//最后修改时间小于等于最大时间
				Date d=dept.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("@@@@"+dept.getDatemax());
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			} 
			
		}
		
		PageHelper.startPage(pageNum, pageSize);
		List<KcDepositoryInformation> list = kcdepoinfo.selectByExample(example);
		PageInfo<KcDepositoryInformation> page=new PageInfo<KcDepositoryInformation>(list);
		
		
		return page;
	}

	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<KcDepositoryInformation> selectAll() {
		System.out.println("%%%%%%%%%%%%%%%%%%%");
		List<KcDepositoryInformation> cs = kcdepoinfo.selectByExample(null);
		System.out.println("$$$$$$$$$$$$$$$$"+cs);
		return cs;
		
	}

}
