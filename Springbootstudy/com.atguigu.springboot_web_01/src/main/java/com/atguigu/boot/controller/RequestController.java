package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: 何川
 * @create:2021-01-11
 **/

@Controller
public class RequestController {

    @RequestMapping("/goto")
    public String gotoPage(HttpServletRequest request){

        request.setAttribute("msg","成功了");
        request.setAttribute("code",200);

        return "success";

    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute("msg") String msg,
                       @RequestAttribute("code") String code,
                       HttpServletRequest request
                       ){
     Object msg1 = request.getAttribute("msg");

     Map<String,Object> map = new HashMap<>();

     map.put("request msg",msg1);
     map.put("annotion msg",msg);

     return  map;



    }


}
