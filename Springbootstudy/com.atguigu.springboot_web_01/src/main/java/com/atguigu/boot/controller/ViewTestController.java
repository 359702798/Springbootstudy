package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: 何川
 * @create:2021-01-13
 **/

@Controller
public class ViewTestController {

    @GetMapping("/atguigu")
    public String atguigu(Model model){
       model.addAttribute("msg","你好小东西");
       model.addAttribute("link","https://www.baidu.com/");
       return  "test_thymeleaf";

    }
}
