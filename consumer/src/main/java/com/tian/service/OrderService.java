package com.tian.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

/**
 * @author ﻿jinzhu.tian@onerway.com
 * @date 2020/4/24
 * 说明：
 */
@FeignClient(value = "ORDERSERVICE")
public interface OrderService {

    @LoadBalanced
    @GetMapping("orders")
    public List<Map<String, Object>> orders();

    @PostMapping("addOrder")
    public Map<String, String> newOrder(Map<String, String> params);
}
