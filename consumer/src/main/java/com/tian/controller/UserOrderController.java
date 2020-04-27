package com.tian.controller;

import com.tian.service.OrderService;
import com.tian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ﻿jinzhu.tian@onerway.com
 * @date 2020/4/24
 * 说明：
 */
@RestController
public class UserOrderController {

    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;

    @GetMapping("userOrder")
    public Map<String, Object> userOrders() {
        Map<String, Object> user = userService.user();
        List<Map<String, Object>> orders = orderService.orders();

        user.put("orders", orders.stream().filter(e -> e.get("userId")
                .equals(user.get("userId"))).collect(Collectors.toList()));
        return user;
    }
}
