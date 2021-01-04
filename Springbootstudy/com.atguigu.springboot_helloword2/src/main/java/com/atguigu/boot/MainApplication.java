package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: 何川
 * @create:2020-12-25
 **/


@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        // 1.返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);


    }
}
