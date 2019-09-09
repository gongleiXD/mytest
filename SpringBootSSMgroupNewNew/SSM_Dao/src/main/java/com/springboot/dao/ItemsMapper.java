package com.springboot.dao;

import com.springboot.pojo.Items;

public interface ItemsMapper {

    Items findById(Integer itemId);
}
