package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.mapper.RsDepartmentMapper;
import com.sc.service.RsDepartmentService;
import com.sc.entity.RsCompnayMessageExample;
import com.sc.entity.RsDepartment;
import com.sc.entity.RsDepartmentExample;
import com.sc.entity.RsDepartmentExample.Criteria;

@Service
public class RsDepartmentServiceImpl implements RsDepartmentService {
	
	//依赖注入
	@Autowired
	RsDepartmentMapper rsDepartmentMapper;
	
	
	//添加
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addRsDepartment(RsDepartment rsdepartment) {
		rsDepartmentMapper.insert(rsdepartment);

	}
	//修改
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateRsDeptment(RsDepartment rsdepartment) {
		if(rsdepartment!=null&&rsdepartment.getDepartmentId()!=null){
			rsDepartmentMapper.updateByPrimaryKey(rsdepartment);
		}

	}
	//删除
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteRsDeptment(Long departmentId) {
		if(departmentId!=null){
			rsDepartmentMapper.deleteByPrimaryKey(departmentId);
		}

	}
	//主键
	@Override
	@Transactional(rollbackFor = Exception.class)
	public RsDepartment getRsDeptment(Long departmentId) {
		if(departmentId!=null){
			return rsDepartmentMapper.selectByPrimaryKey(departmentId);
			}
			return null;
			
	}
	//详细查询
		@Override
		@Transactional(rollbackFor = Exception.class)
		public PageInfo<RsDepartment> selectRsDepartment(Integer pageNum, Integer pageSize, RsDepartment rsdepartment) {
			RsDepartmentExample example=new RsDepartmentExample();
			
			if(rsdepartment!=null){
				Criteria criteria = example.createCriteria();
				//if(depot.getDepotName()!=null&&!depot.getDepotName().equals(""))
				if(!StringUtils.isEmpty(rsdepartment.getDepartmentName())){//仓库名称模糊查询
					criteria.andDepartmentNameLike("%"+rsdepartment.getDepartmentName()+"%");
					System.out.println("进入模糊查询"+rsdepartment.getDepartmentName());
				}
				if(!StringUtils.isEmpty(rsdepartment.getDatemin())){//最后修改时间大于等于最小日期
					System.out.println("----小----"+rsdepartment.getDatemin());
					criteria.andLastModifyDateGreaterThanOrEqualTo(rsdepartment.getDatemin());
				}
				if(!StringUtils.isEmpty(rsdepartment.getDatemax())){//最后修改时间小于等于最大日期
					Date d=rsdepartment.getDatemax();
					d.setHours(23);
					d.setMinutes(59);
					d.setSeconds(59);
					System.out.println("----大----"+d);
					criteria.andLastModifyDateLessThanOrEqualTo(d);
				}
			}
			
			PageHelper.startPage(pageNum, pageSize);
			List<RsDepartment> list= rsDepartmentMapper.selectByExample(example);
			PageInfo<RsDepartment> page=new PageInfo<RsDepartment>(list);
			
			return page;
		}

}
