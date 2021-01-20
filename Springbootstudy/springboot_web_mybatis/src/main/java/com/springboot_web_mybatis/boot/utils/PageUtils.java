package com.springboot_web_mybatis.boot.utils;

import com.github.pagehelper.PageInfo;
import com.springboot_web_mybatis.boot.page.account.PageRequest;
import com.springboot_web_mybatis.boot.page.account.PageResult;

/**
 * @author: 何川
 * @create:2021-01-20
 **/
public class PageUtils {

    /**
     * 将分页信息封装到统一的接口
     * @param pageRequest
     * @param pageInfo
     * @return
     */
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
