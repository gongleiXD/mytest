package com.springboot.Service.impl;

import com.springboot.Service.UserService;
import com.springboot.dao.UserDao;
import com.springboot.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserviceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void add(User user) {
        userDao.add(user);
    }
}
