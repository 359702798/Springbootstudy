package com.springboot_web_mybatis.boot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot_web_mybatis.boot.dao.AccountMapper;
import com.springboot_web_mybatis.boot.domain.Account;
import com.springboot_web_mybatis.boot.page.account.PageRequest;
import com.springboot_web_mybatis.boot.page.account.PageResult;
import com.springboot_web_mybatis.boot.service.AccountService;
import com.springboot_web_mybatis.boot.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 何川
 * @create:2021-01-20
 **/
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;




    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest,getPageInfo(pageRequest));
    }


    public PageInfo<Account> getPageInfo(PageRequest pageRequest) {
        int pageNum= pageRequest.getPageNum();
        int pageSize= pageRequest.getPageSize();
        PageHelper.startPage(pageNum,pageSize);
        List<Account> accountList = accountMapper.query();

        return new PageInfo<Account>(accountList);

    }
}
