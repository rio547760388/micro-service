package com.tian.config;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

/**
 * @author Administrator
 * @since 2021/4/10
 * 说明：
 */
@Configuration(proxyBeanMethods = false)
public class JpaConfig {

    @Bean
    JPAQueryFactory jpaQuery(EntityManager entityManager) {
        JPAQueryFactory query = new JPAQueryFactory(entityManager);
        return query;
    }
}
