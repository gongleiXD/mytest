package com.springboot.dao;

import com.springboot.user.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    @Insert("insert into `user1`  value(null,#{age},#{name})")
    void add(User user);
}
