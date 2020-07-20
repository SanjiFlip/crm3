package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CgStockReplenishmentGoods;

public interface CgStockReplGoodsService {
	
	public void addcgrep(CgStockReplenishmentGoods repgoods);
	
	public void deletecgrep(Long id);
	
	public void updatecgrep(CgStockReplenishmentGoods repgoods);

	public CgStockReplenishmentGoods getcgrep(Long id);
	
	public PageInfo<CgStockReplenishmentGoods> selectcgrep(Integer pageNum,Integer pageSize,CgStockReplenishmentGoods repgoods);
    
	public List<CgStockReplenishmentGoods> selectall();
}
