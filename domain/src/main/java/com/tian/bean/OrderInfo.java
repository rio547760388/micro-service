package com.tian.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Administrator
 * @since 2021/4/9
 * 说明：
 */
@Data
@Table(name = "MS_ORDER_INFO")
@Entity
public class OrderInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "PRODUCT")
    private String product;

    @Column(name = "CNT")
    private Integer cnt;

    @Column(name = "PRICE", scale = 4, precision = 16)
    private BigDecimal price;

    @Column(name = "TOTAL_PRICE", scale = 4, precision = 16)
    private BigDecimal totalPrice;
}
