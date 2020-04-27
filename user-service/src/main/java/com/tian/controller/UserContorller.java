package com.tian.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ﻿jinzhu.tian@onerway.com
 * @date 2020/4/24
 * 说明：
 */
@RestController
public class UserContorller {

    @GetMapping("users")
    @HystrixCommand(fallbackMethod = "userFallbakc")
    public Object user() {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", 1);
        map.put("userName", "Rio");

        //int a = 1/0;
        return map;
    }

    public Object userFallbakc() {
        System.out.println("断路器");
        return Collections.EMPTY_MAP;
    }
}
