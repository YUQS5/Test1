package com.cskaoyan.controller;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("login")
    public String Login(){
        return "/login.jsp";
    }

    @RequestMapping("gotoLogin")
    public String queryUser(String username , String password ,String age,String email){
        User user=userService.queryUserByUsername("username");
        if(user==null){
            User user1 = new User();
            user1.setUsername(username);
            user1.setPassword(password);
            int age1 = Integer.parseInt(age);
            user1.setAge(age1);
            user1.setEmail(email);
            int i = userService.insertUser(user1);
            if(i==1){
                return "/success.jsp";
            }else{
                System.out.println("注册失败，请重新注册");
                return "/login.jsp";
            }

        }else{
            System.out.println("用户名已经存在，请重新注册！");
            return "/login.jsp";
        }
    }
    @RequestMapping("date")
    @ResponseBody
    public String helloDate(Date birthday){
        return birthday.toString();
    }

}
