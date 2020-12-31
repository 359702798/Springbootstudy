package com.atguigu.boot.config;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = true)//告诉springboot 这是一个配置类。
public class MyConfig {
    /**
     * 当proxyBeanMethods为True时,组件无论获取多少次都是单例的
     * @return
     */

    @Bean
    public Pet pet01(){

        return  new Pet("大象",1000d);
    }

    // @Bean//给容器中添加组件。以方法名作为组件得id,返回类型就是组件类型。
     //返回的值,就是在容器中的实例。
    //@ConditionalOnBean(name="pet01")//当容器中有pet01这个组件的时候,才会注入user组件。
    @Bean
    public User user01(){

      return  new User("李四",11);

    }





}
