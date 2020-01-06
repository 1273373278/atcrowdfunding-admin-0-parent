package com.atguigu.crowd.funding.service.api;

import com.atguigu.crowd.funding.entity.Admin;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-01-06 20:58
 */
public interface AdminService {
    List<Admin> getAll();

    Admin login(String loginAcct, String userPswd);
}
