package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 何川
 * @create:2021-01-04
 **/

@RestController
public class HelloWorldController {

    @Autowired
   private Person person;

    @RequestMapping("/hello")
    public Person getPerson(){
        return  person;
    }

}
