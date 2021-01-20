package com.springboot_web_mybatis.boot.controller;

import com.springboot_web_mybatis.boot.page.account.PageRequest;
import com.springboot_web_mybatis.boot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author: 何川
 * @create:2021-01-20
 **/
@Controller
public class AccountController {
  @Autowired
  private AccountService accountService;
    @PostMapping(value="/findPage")
    public Object findPage(@RequestBody PageRequest pageQuery) {
        return accountService.findPage(pageQuery);
    }
}
