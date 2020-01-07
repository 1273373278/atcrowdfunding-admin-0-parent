package com.atguigu.crowd.funding.mapper;


import com.atguigu.crowd.funding.entity.ParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ParamMapper {
    int countByExample(ParamExample example);

    int deleteByExample(ParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Param record);

    int insertSelective(Param record);

    List<Param> selectByExample(ParamExample example);

    Param selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Param record, @Param("example") ParamExample example);

    int updateByExample(@Param("record") Param record, @Param("example") ParamExample example);

    int updateByPrimaryKeySelective(Param record);

    int updateByPrimaryKey(Param record);
}