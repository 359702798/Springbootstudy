package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author: 何川
 * @create:2021-01-12
 **/

@Controller
public class ResponseTestController {

    @ResponseBody
    @RequestMapping("/test/person")
    public Person getPerson(){
        Person person = new Person();
         person.setAge(20);
         person.setBirth(new Date());
         person.setUserName("zhangsan");

         return  person;

    }
}
