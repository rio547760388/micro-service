package com.tian.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Administrator
 * @since 2021/4/10
 * 说明：
 */
@NoRepositoryBean
public interface CommonRepository<T, ID> extends JpaRepository<T, ID>, QuerydslPredicateExecutor<T> {
}
