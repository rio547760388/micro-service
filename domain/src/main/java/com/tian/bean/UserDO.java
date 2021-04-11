package com.tian.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Administrator
 * @since 2021/4/9
 * 说明：
 */
@Data
@Table(name = "MS_USER")
@Entity
public class UserDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "AGE")
    private Short age;
}
