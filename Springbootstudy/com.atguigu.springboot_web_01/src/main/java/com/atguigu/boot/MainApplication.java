package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: 何川
 * @create:2020-12-25
 **/

/**
 * 1.配置类里使用@Bean标注在方法上给容器注册组件,默认是单实例的
 * 2.配置类本身也是组件
 * 3.ProxyBeanMethods: 代理bean的方法
 *
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

    }
}
