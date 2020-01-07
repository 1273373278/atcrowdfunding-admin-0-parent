package com.atguigu.crowd.funding.service.impl;

import com.atguigu.crowd.funding.entity.Admin;
import com.atguigu.crowd.funding.entity.AdminExample;
import com.atguigu.crowd.funding.mapper.AdminMapper;
import com.atguigu.crowd.funding.service.api.AdminService;
import com.atguigu.crowd.funding.util.CrowdFundingUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


/**
 * @author shkstart
 * @create 2020-01-06 20:58
 */

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminMapper adminMapper;

    public List<Admin> getAll() {
        return adminMapper.selectByExample(new AdminExample());
    }

    public Admin login(String loginAcct, String userPswd) {
        // 根据loginAcct查询数据库
        AdminExample adminExample = new AdminExample();

        //adminExample.createCriteria().andLoginAcctEqualTo(loginAcct);
        adminExample.createCriteria().andLoginacctEqualTo(loginAcct);

        // 执行查询
        List<Admin> list = adminMapper.selectByExample(adminExample);

        if(!CrowdFundingUtils.collectionEffective(list)) {

            // 如果查询结果集合无效，则直接返回null
            return null;
        }

        // 获取唯一集合元素
        Admin admin = list.get(0);

        // 确认admin不为null
        if(admin == null) {

            return null;
        }

        // 比较密码
        String userPswdDataBase = admin.getUserpswd();

        String userPswdBroswer = CrowdFundingUtils.md5(userPswd);

        if(Objects.equals(userPswdBroswer, userPswdDataBase)) {

            // 如果两个密码相等那么说明登录能够成功，返回Admin对象
            return admin;
        }

        return null;
    }

    @Override
    public PageInfo<Admin> queryForKeywordSearch(Integer pageNum, Integer pageSize, String keyword) {
        // 1.调用PageHelper的工具方法，开启分页功能
        PageHelper.startPage(pageNum, pageSize);

        // 2.执行分页查询
        List<Admin> list = adminMapper.selectAdminListByKeyword(keyword);

        // 3.将list封装到PageInfo对象中
        return new PageInfo<>(list);
    }
}
