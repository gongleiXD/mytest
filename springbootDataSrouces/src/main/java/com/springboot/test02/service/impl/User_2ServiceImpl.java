package com.springboot.test02.service.impl;

import com.springboot.pojo.User;
import com.springboot.test02.dao.User_2Dao;
import com.springboot.test02.service.User_2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_2ServiceImpl implements User_2Service {
    @Autowired
    private User_2Dao user_2Dao;

    @Override
    public void add(User user) {
            user_2Dao.add(user);
    }
}
