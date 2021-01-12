package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 何川
 * @create:2021-01-11
 **/

@RestController
public class ParameterTestController {
    /**
     *
     * 数据绑定
     */
    @RequestMapping("/saveUser")
    public Person saveUser(Person person){
        return  person;
    }

   @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String useragent,
                                     @RequestHeader Map<String,String> header,
                                     @RequestParam("age") Integer age ,
                                     @RequestParam("interesting")List<String> interesting,
                                     @RequestParam Map<String,String> param,
                                     //@CookieValue("_ga") String _ga,
                                     //@CookieValue("_ga") Cookie cookie,
                                     HttpServletRequest request)
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


        return  map;


    }



    @PostMapping("/save")
    public Map postMethod(@RequestBody String content){
        Map<String,Object> map = new HashMap<>();
        map.put("content",content);
        return map;
    }


}
