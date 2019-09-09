package com.springboot.test02.controller;

import com.springboot.pojo.User;
import com.springboot.test02.dao.User_2Dao;
import com.springboot.test02.service.User_2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User_2Controller {
    @Autowired
    private User_2Service user_2Service;


    @Autowired
    private User_2Dao user_2Dao;
    @RequestMapping("/addUser_2")
    public String addUser_1(){
        User user=new User();
        user.setAge(18);
        user.setName("张三");
        user_2Dao.add(user);
        return  "index2";
    }
}
