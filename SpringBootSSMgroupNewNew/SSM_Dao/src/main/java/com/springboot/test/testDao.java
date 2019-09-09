package com.springboot.test;

import com.springboot.dao.ItemsMapper;
import com.springboot.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDao {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
        ItemsMapper itemsMapper = applicationContext.getBean(ItemsMapper.class);
        Items items = itemsMapper.findById(1);
        System.out.println(items);
    }
}
