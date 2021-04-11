package com.tian.dao;

import com.tian.bean.UserDO;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @since 2021/4/9
 * 说明：
 */
@Repository
public interface UserRepository extends CommonRepository<UserDO, Long> {
}
