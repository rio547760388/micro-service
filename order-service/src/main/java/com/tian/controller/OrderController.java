package com.tian.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
public class OrderController {

    @GetMapping("orders")
    public List<Map<String, Object>> orders() {
        List<Map<String, Object>> list = new ArrayList();
        Map<String, Object> map = new HashMap<>();
        map.put("userId", 1);
        map.put("productName", "Iphone 11");
        map.put("price", 9998);
        list.add(map);
        return list;
    }
}
