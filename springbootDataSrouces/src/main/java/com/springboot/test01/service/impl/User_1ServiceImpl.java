package com.springboot.test01.service.impl;

import com.springboot.pojo.User;
import com.springboot.test01.dao.User_1Dao;
import com.springboot.test01.service.User_1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_1ServiceImpl implements User_1Service {
    @Autowired
    private User_1Dao user_1Dao;
;
    @Override
    public void addUser1(User user) {
        user_1Dao.add(user);
    }
}
