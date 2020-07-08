package com.sc.mapper;

import com.sc.entity.KcDepositoryInformation;
import com.sc.entity.KcDepositoryInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KcDepositoryInformationMapper {
    int countByExample(KcDepositoryInformationExample example);

    int deleteByExample(KcDepositoryInformationExample example);

    int deleteByPrimaryKey(Long depositoryId);

    int insert(KcDepositoryInformation record);

    int insertSelective(KcDepositoryInformation record);

    List<KcDepositoryInformation> selectByExample(KcDepositoryInformationExample example);

    KcDepositoryInformation selectByPrimaryKey(Long depositoryId);

    int updateByExampleSelective(@Param("record") KcDepositoryInformation record, @Param("example") KcDepositoryInformationExample example);

    int updateByExample(@Param("record") KcDepositoryInformation record, @Param("example") KcDepositoryInformationExample example);

    int updateByPrimaryKeySelective(KcDepositoryInformation record);

    int updateByPrimaryKey(KcDepositoryInformation record);
}