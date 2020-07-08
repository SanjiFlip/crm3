package com.sc.mapper;

import com.sc.entity.CgStockReplenishmentGoods;
import com.sc.entity.CgStockReplenishmentGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgStockReplenishmentGoodsMapper {
    int countByExample(CgStockReplenishmentGoodsExample example);

    int deleteByExample(CgStockReplenishmentGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CgStockReplenishmentGoods record);

    int insertSelective(CgStockReplenishmentGoods record);

    List<CgStockReplenishmentGoods> selectByExample(CgStockReplenishmentGoodsExample example);

    CgStockReplenishmentGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CgStockReplenishmentGoods record, @Param("example") CgStockReplenishmentGoodsExample example);

    int updateByExample(@Param("record") CgStockReplenishmentGoods record, @Param("example") CgStockReplenishmentGoodsExample example);

    int updateByPrimaryKeySelective(CgStockReplenishmentGoods record);

    int updateByPrimaryKey(CgStockReplenishmentGoods record);
}