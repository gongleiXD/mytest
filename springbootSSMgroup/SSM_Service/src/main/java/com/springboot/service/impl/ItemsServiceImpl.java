package com.springboot.service.impl;

import com.springboot.dao.ItemsMapper;
import com.springboot.pojo.Items;
import com.springboot.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public Items findById(int itemId) {
        Items items = itemsMapper.findById(itemId);
        return items;
    }
}
