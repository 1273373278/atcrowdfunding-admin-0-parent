package com.atguigu.crowd.funding.mapper;

import com.atguigu.crowd.funding.entity.AccountTypeCert;
import com.atguigu.crowd.funding.entity.AccountTypeCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountTypeCertMapper {
    int countByExample(AccountTypeCertExample example);

    int deleteByExample(AccountTypeCertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountTypeCert record);

    int insertSelective(AccountTypeCert record);

    List<AccountTypeCert> selectByExample(AccountTypeCertExample example);

    AccountTypeCert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountTypeCert record, @Param("example") AccountTypeCertExample example);

    int updateByExample(@Param("record") AccountTypeCert record, @Param("example") AccountTypeCertExample example);

    int updateByPrimaryKeySelective(AccountTypeCert record);

    int updateByPrimaryKey(AccountTypeCert record);
}