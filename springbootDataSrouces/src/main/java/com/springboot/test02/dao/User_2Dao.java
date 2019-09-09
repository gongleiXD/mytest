package com.springboot.test02.dao;

import com.springboot.pojo.User;
import org.apache.ibatis.annotations.Insert;


public interface User_2Dao {

    @Insert("INSERT INTO user2 VALUE(NULL,#{age},#{name})")
    void add(User user);
}
