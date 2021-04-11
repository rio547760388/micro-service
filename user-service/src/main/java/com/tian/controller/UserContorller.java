package com.tian.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tian.bean.QUserDO;
import com.tian.bean.UserDO;
import com.tian.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Autowired
    UserRepository userRepository;

    @Autowired
    JPAQueryFactory jpaQueryFactory;

    @GetMapping("users")
    @HystrixCommand(fallbackMethod = "userFallbakc")
    public Object user() {
        QUserDO qUserDO = QUserDO.userDO;
        Page<UserDO> users = userRepository.findAll(qUserDO.username.eq("rio"), Pageable.unpaged());

        jpaQueryFactory.from(qUserDO).fetch();
        return users;
    }

    public Object userFallbakc() {
        System.out.println("断路器");
        return Collections.EMPTY_MAP;
    }
}
