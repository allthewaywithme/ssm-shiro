package com.giant.test.controller;

import com.giant.user.entity.User;
import com.giant.user.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/11 20:47
 */
@RequestMapping("/test")
@Controller
public class TestController {

    @Autowired
    private UserService userService;


    @RequiresPermissions("attend:a")
    @RequestMapping("/a")
    public String aa(){
        return "aa";
    }

    @RequiresPermissions("attend:b")
    @RequestMapping("/b")
    public String bb(){
        return "bb";
    }

    @RequiresPermissions("attend:c")
    @RequestMapping("/c")
    public String cc(){
        return "cc";
    }

    @RequiresPermissions("attend:d")
    @RequestMapping("/d")
    public String dd(){
        return "dd";
    }

}
