package com.sc.service;


import com.github.pagehelper.PageInfo;
import com.sc.entity.RsCompnayMessage;

public interface RsCompnayMessageService {

	public void addRsCompnay(RsCompnayMessage rscompnay); 

	public void updateRsCompnay(RsCompnayMessage rscompnay);

	public void deleteRsCompnay(Long compnayId);

	public RsCompnayMessage getRsCompnay(Long compnayId);

	public PageInfo<RsCompnayMessage> selectRsCompnay(Integer pageNum,Integer pageSize, RsCompnayMessage rscompnay);
}
