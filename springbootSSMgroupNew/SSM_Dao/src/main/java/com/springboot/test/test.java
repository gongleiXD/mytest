package com.springboot.test;

import com.springboot.dao.ItemsMapper;
import com.springboot.pojo.Items;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Autowired
    private ItemsMapper itemsMapper;

    @Test
    public void test(){
        //获取 spring 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
        //获取 Mapper
        ItemsMapper itemsMapper = applicationContext.getBean(ItemsMapper.class);
        //调用 Mapper 方法
        Items items = itemsMapper.findById(1); System.out.println(items);

    }


}
