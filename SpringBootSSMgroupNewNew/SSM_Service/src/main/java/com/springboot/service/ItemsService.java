package com.springboot.service;

import com.springboot.pojo.Items;

public interface ItemsService {
    Items findById(Integer itemId);
}
