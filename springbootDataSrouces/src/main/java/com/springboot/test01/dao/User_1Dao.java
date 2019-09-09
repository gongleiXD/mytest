package com.springboot.test01.dao;

import com.springboot.pojo.User;
import org.apache.ibatis.annotations.Insert;


public interface User_1Dao {
    @Insert("INSERT INTO user1 VALUE(NULL,#{age},#{name})")
    void add(User user);
}
