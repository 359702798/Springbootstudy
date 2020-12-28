package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 何川
 * @create:2020-12-25
 **/

@RestController
public class HelloController {


    @RequestMapping("hello")
    public String hello(){


                        return "放假了!";
    }










}

