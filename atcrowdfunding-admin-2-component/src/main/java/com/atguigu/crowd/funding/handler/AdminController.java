package com.atguigu.crowd.funding.handler;

import com.atguigu.crowd.funding.entity.Admin;
import com.atguigu.crowd.funding.service.api.AdminService;
import com.atguigu.crowd.funding.util.CrowdFundingConstant;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-01-06 20:41
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
   private AdminService adminService;

    //管理员登录页面
    @RequestMapping("/login")
    public String showAdminLogin(){
        return "admin-login";
    }

    //管理员登录验证
    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam("loginAcct") String loginAcct,
                          @RequestParam("userPswd") String userPswd,
                          Model model,
                          HttpSession session){
// 调用adminService的login方法执行登录业务逻辑，返回查询到的Admin对象
        Admin admin = adminService.login(loginAcct, userPswd);

        // 判断admin是否为null
        if(admin == null) {

            model.addAttribute(CrowdFundingConstant.ATTR_NAME_MESSAGE, CrowdFundingConstant.MESSAGE_LOGIN_FAILED);

            return "admin-login";
        }

        session.setAttribute(CrowdFundingConstant.ATTR_NAME_LOGIN_ADMIN, admin);

        //return "admin-main";
       return "redirect:/admin/main.html";
    }

    //登录成功，跳转管理员页面
    @RequestMapping("/main")
    public String toLoginPage() {
        return "admin-main";
    }

    //测试查找全部admin
/*    @RequestMapping("/getall")
    public String getAll(Model model) {

        List<Admin> list = adminService.getAll();

        model.addAttribute("list", list);

        return "admin-target";
    }*/
    //退出
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }


    @RequestMapping("/queryForSearch")
    public String queryForSearch(
            // 如果页面上没有提供对应的请求参数，那么可以使用defaultValue指定默认值
            @RequestParam(value="pageNum", defaultValue="1") Integer pageNum,
            @RequestParam(value="pageSize", defaultValue="5") Integer pageSize,
            @RequestParam(value="keyword", defaultValue="") String keyword,
            Model model
    ){
        PageInfo<Admin> pageInfo = adminService.queryForKeywordSearch(pageNum,pageSize,keyword);
        model.addAttribute(CrowdFundingConstant.ATTR_NAME_PAGE_INFO,pageInfo);

        return "admin-page";

    }



}
