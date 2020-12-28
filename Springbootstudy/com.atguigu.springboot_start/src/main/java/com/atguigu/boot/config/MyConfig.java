package com.atguigu.boot.config;


import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration//告诉springboot 这是一个配置类。
public class MyConfig {

    public User user01(){

        return  new User("李四",10);
    }



}
