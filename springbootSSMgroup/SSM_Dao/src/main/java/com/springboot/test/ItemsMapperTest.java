package com.springboot.test;

import com.springboot.dao.ItemsMapper;
import com.springboot.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsMapperTest {

    @Test
    public void testFindItemsById() {
//获取 spring 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
//获取 Mapper
        ItemsMapper itemsMapper = applicationContext.getBean(ItemsMapper.class);
//调用 Mapper 方法
        Items items = itemsMapper.findById(8); System.out.println(items);
    }

}
