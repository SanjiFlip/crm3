package com.sc.mapper;

import com.sc.entity.KcGoodsInformation;
import com.sc.entity.KcGoodsInformationExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KcGoodsInformationMapper {
    int countByExample(KcGoodsInformationExample example);

    int deleteByExample(KcGoodsInformationExample example);

    int deleteByPrimaryKey(BigDecimal goodsId);

    int insert(KcGoodsInformation record);

    int insertSelective(KcGoodsInformation record);

    List<KcGoodsInformation> selectByExample(KcGoodsInformationExample example);

    KcGoodsInformation selectByPrimaryKey(BigDecimal goodsId);

    int updateByExampleSelective(@Param("record") KcGoodsInformation record, @Param("example") KcGoodsInformationExample example);

    int updateByExample(@Param("record") KcGoodsInformation record, @Param("example") KcGoodsInformationExample example);

    int updateByPrimaryKeySelective(KcGoodsInformation record);

    int updateByPrimaryKey(KcGoodsInformation record);
}