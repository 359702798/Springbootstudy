package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: 何川
 * @create:2020-12-25
 **/

@Slf4j
@RestController
public class HelloController {

    @Resource
    private Car car;

    @RequestMapping("hello2")
    public String hello(String name){

        log.info("进入方法了");
        return "你好!我的名字是"+name;
    }



    @RequestMapping("getCar")
    public Car getCar(){

      return  car;
    }







}

