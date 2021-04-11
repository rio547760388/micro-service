package com.tian.controller;

import com.tian.dao.OrderInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ﻿jinzhu.tian@onerway.com
 * @date 2020/4/24
 * 说明：
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private OrderInfoRepository orderInfoRepository;
    

    @GetMapping("orders")
    public List<Map<String, Object>> orders() {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("userId", 1);
        map.put("productName", "Iphone 11");
        map.put("price", 9998);
        list.add(map);
        return list;
    }
}
