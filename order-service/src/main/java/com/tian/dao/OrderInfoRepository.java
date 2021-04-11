package com.tian.dao;

import com.tian.bean.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @since 2021/4/10
 * 说明：
 */
@Repository
public interface OrderInfoRepository extends CommonRepository<OrderInfo, Long> {
}
