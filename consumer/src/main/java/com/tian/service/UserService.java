package com.tian.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 * @author ﻿jinzhu.tian@onerway.com
 * @date 2020/4/24
 * 说明：
 */
@FeignClient(value = "userService")
public interface UserService {

    @GetMapping("users")
    public Map<String, Object> user();

}
