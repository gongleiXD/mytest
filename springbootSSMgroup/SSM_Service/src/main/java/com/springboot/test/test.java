package com.springboot.test;

import com.springboot.pojo.Items;
import com.springboot.service.ItemsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class test {
    @Autowired
    private ItemsService itemsService;

    @Test
    public void findByIdTest(){
        Items items = itemsService.findById(1);
        System.out.println(items);
    }
}
