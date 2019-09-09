package com.springboot.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@RestController
@RequestMapping("/redis")
public class RedisController {


    @RequestMapping("/searchUser")
    public  String searchUser() throws JsonProcessingException {

        String str=null;


            Jedis jedis =new Jedis("127.0.0.1",6379);
            User user =new User();
            user.setName("amdin1111");
            user.setAge(9999);

        ObjectMapper objectMapper =new ObjectMapper();//jakjson
        String s = objectMapper.writeValueAsString(user);
        if(null==jedis.get("users")){
                //redis没有数据
                jedis.set("users",s);
            System.out.println("从数据库取值");
            str=s;
            }
            else {

            System.out.println("从redis中取值");
            str=jedis.get("users");



        }

        System.out.println(str);




return "ok";
    }
}
