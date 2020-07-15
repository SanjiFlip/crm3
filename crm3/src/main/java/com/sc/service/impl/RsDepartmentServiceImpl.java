package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.RsDepartment;
import com.sc.entity.RsDepartmentExample;
import com.sc.entity.RsDepartmentExample.Criteria;
import com.sc.mapper.RsDepartmentMapper;
import com.sc.service.RsDepartmentService;

@Service
public class RsDepartmentServiceImpl implements RsDepartmentService {
	

	@Autowired
	RsDepartmentMapper rsDepartmentMapper;
	
	

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addRsDepartment(RsDepartment rsdepartment) {
		rsDepartmentMapper.insert(rsdepartment);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateRsDeptment(RsDepartment rsdepartment) {
		if(rsdepartment!=null&&rsdepartment.getDepartmentId()!=null){
			rsDepartmentMapper.updateByPrimaryKey(rsdepartment);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteRsDeptment(Long departmentId) {
		if(departmentId!=null){
			rsDepartmentMapper.deleteByPrimaryKey(departmentId);
		}

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public RsDepartment getRsDeptment(Long departmentId) {
		if(departmentId!=null){
			return rsDepartmentMapper.selectByPrimaryKey(departmentId);
			}
			return null;
			
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public PageInfo<RsDepartment> selectRsDepartment(Integer pageNum, Integer pageSize, RsDepartment rsdepartment) {
		RsDepartmentExample example=new RsDepartmentExample();
		
		if(rsdepartment!=null){
			Criteria criteria = example.createCriteria();

			if(!StringUtils.isEmpty(rsdepartment.getDepartmentName())){
				criteria.andDepartmentNameLike("%"+rsdepartment.getDepartmentName()+"%");
			}
			if(!StringUtils.isEmpty(rsdepartment.getDatemin())){
				criteria.andLastModifyDateGreaterThanOrEqualTo(rsdepartment.getDatemin());
			}
			if(!StringUtils.isEmpty(rsdepartment.getDatemax())){
				Date d=rsdepartment.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
		PageHelper.startPage(pageNum, pageSize);
		List<RsDepartment> list= rsDepartmentMapper.selectByExample(example);
		PageInfo<RsDepartment> page=new PageInfo<RsDepartment>(list);
		return page;
	}

}
