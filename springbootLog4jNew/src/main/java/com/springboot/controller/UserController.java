package com.springboot.controller;

import com.springboot.dao.UserDao;
import com.springboot.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/add")
public  String add() {
        User user=new User();
        user.setAge(17);
        user.setName("哥哥");
    userDao.add(user);
        System.out.println("添加成功!");
        return "ok";

    }

    @RequestMapping("/find")
    public  String find(){

            System.out.println("查找成功");
    return "ok";

}

}
