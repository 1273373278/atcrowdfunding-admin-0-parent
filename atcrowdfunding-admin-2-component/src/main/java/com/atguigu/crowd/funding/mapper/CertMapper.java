package com.atguigu.crowd.funding.mapper;

import com.atguigu.crowd.funding.entity.Cert;
import com.atguigu.crowd.funding.entity.CertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertMapper {
    int countByExample(CertExample example);

    int deleteByExample(CertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cert record);

    int insertSelective(Cert record);

    List<Cert> selectByExample(CertExample example);

    Cert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cert record, @Param("example") CertExample example);

    int updateByExample(@Param("record") Cert record, @Param("example") CertExample example);

    int updateByPrimaryKeySelective(Cert record);

    int updateByPrimaryKey(Cert record);
}