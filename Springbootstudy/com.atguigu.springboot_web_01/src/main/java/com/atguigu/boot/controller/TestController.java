package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author: 何川
 * @create:2021-01-04
 **/


@RestController
public class TestController {

    @GetMapping("/user")
    //@RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        return "get所有用户";
    }

    @PostMapping("/user")
    //@RequestMapping(value = "/user",method = RequestMethod.POST)
    public String addUser(){

        return "post了用户";
    }

    @PutMapping("/user")
    //@RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String putUser(){
        return "put用户成功";
    }

    @DeleteMapping("/user")
    //@RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
          return "delete用户成功";
    }
}
