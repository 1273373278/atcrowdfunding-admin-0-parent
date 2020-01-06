package com.atguigu.crowd.funding.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2020-01-06 20:23
 */

@Controller
public class PortalController {

    @RequestMapping("/index")
    public String shuoIndex(){
        return "index-page";
    }
}
