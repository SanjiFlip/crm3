package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.KcGoodsInformation;

public interface KcGoodsInformationService {
	
	
	public void addkcgoods(KcGoodsInformation goods);
	
	public void deletekcgoods(BigDecimal goodsId);
	
	public void updatekcgoods(KcGoodsInformation goods);
	
	public PageInfo<KcGoodsInformation> selectgoods(Integer pageNum,Integer pageSize,KcGoodsInformation goods);
	//通过id获取对象
	public KcGoodsInformation getgoods(BigDecimal goodsId);
	
	public PageInfo<KcGoodsInformation> selectrepgoods(Integer pageNum,Integer pageSize,KcGoodsInformation goods);
	
	public PageInfo<KcGoodsInformation> selectrepgoodsbyid(Integer pageNum,Integer pageSize,Long depositoryId);
	
	public PageInfo<KcGoodsInformation> selectgoodsbyid(Integer pageNum,Integer pageSize,BigDecimal goodsId);
	
	public List<KcGoodsInformation> selectall();

}
