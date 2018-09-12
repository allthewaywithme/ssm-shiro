package com.giant.user.controller;

import com.giant.user.entity.User;
import com.giant.user.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static org.apache.shiro.SecurityUtils.getSubject;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/11 20:47
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    /**
     * 获取用户信息
     * @param session
     * @return
     */
    @RequestMapping("/userinfo")
    @ResponseBody
    public User getUser(HttpSession session){
        User user = (User)session.getAttribute("userinfo");
        return user;
    }

    /**
     * 登出方法
     * @return
     */
   /* @RequestMapping("/logout")
    public String logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //摧毁session 返回登陆页面
        //在这里执行退出系统前需要清空的数据
        session.invalidate();
        return "login";
    }*/


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
