package com.springboot_web_mybatis.boot.service;

import com.springboot_web_mybatis.boot.page.account.PageRequest;
import com.springboot_web_mybatis.boot.page.account.PageResult;

/**
 * @author: 何川
 * @create:2021-01-20
 **/
public interface AccountService {

    PageResult findPage(PageRequest pageRequest);
}
