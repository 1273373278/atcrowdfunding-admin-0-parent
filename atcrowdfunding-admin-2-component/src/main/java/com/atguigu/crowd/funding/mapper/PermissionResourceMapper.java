package com.atguigu.crowd.funding.mapper;

import com.atguigu.crowd.funding.entity.PermissionResource;
import com.atguigu.crowd.funding.entity.PermissionResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionResourceMapper {
    int countByExample(PermissionResourceExample example);

    int deleteByExample(PermissionResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PermissionResource record);

    int insertSelective(PermissionResource record);

    List<PermissionResource> selectByExample(PermissionResourceExample example);

    PermissionResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PermissionResource record, @Param("example") PermissionResourceExample example);

    int updateByExample(@Param("record") PermissionResource record, @Param("example") PermissionResourceExample example);

    int updateByPrimaryKeySelective(PermissionResource record);

    int updateByPrimaryKey(PermissionResource record);
}