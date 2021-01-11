package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 何川
 * @create:2021-01-11
 **/

@RestController
public class ParameterTestController {


   @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String useragent,
                                     @RequestHeader Map<String,String> header,
                                     @RequestParam("age") Integer age ,
                                     @RequestParam("interesting")List<String> interesting,
                                     @RequestParam Map<String,String> param,
                                     @CookieValue("_ga") String _ga,
                                     @CookieValue("_ga") Cookie cookie)
                                     {


        Map<String,Object> map = new HashMap<>();

        //map.put("id",id);
        //map.put("name",name);
        //map.put("pv",pv);
        // map.put("useragent",useragent);
        // map.put("header",header);
        map.put("age",age);
        map.put("interesting",interesting);
        map.put("param",param);

       // map.put("_ga",_ga);
        //System.out.println(cookie.getName()+"----->"+cookie.getValue());
        return  map;


    }



    @PostMapping("/save")
    public Map postMethod(@RequestBody String content){
        Map<String,Object> map = new HashMap<>();
        map.put("content",content);
        return map;
    }


}
