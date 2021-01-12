package com.atguigu.boot.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author: 何川
 * @create:2021-01-12
 **/

@Data
public class Person {
    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;
}
