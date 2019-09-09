package com.springboot.test01.controller;

import com.springboot.pojo.User;
import com.springboot.test01.dao.User_1Dao;
import com.springboot.test01.service.User_1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class User_1Controller {

    @Autowired
    private User_1Service user_1Service;

    @Autowired
    private User_1Dao user_1Dao;

    @RequestMapping("/addUser_1")
    public String addUser_1(){
        User user=new User();
        user.setAge(18);
        user.setName("张三");
        user_1Dao.add(user);
        return  "index";
    }

}
