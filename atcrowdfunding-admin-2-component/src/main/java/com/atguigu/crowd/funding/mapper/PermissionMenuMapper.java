package com.atguigu.crowd.funding.mapper;

import com.atguigu.crowd.funding.entity.PermissionMenu;
import com.atguigu.crowd.funding.entity.PermissionMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionMenuMapper {
    int countByExample(PermissionMenuExample example);

    int deleteByExample(PermissionMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PermissionMenu record);

    int insertSelective(PermissionMenu record);

    List<PermissionMenu> selectByExample(PermissionMenuExample example);

    PermissionMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PermissionMenu record, @Param("example") PermissionMenuExample example);

    int updateByExample(@Param("record") PermissionMenu record, @Param("example") PermissionMenuExample example);

    int updateByPrimaryKeySelective(PermissionMenu record);

    int updateByPrimaryKey(PermissionMenu record);
}