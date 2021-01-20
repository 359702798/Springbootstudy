package com.springboot_web_mybatis.boot.page.account;

import lombok.Data;

/**
 * @author: 何川
 * @create:2021-01-20
 **/
@Data
public class PageRequest {
    // 当前的页数
    private  int pageNum;

    // 每页的数量
    private  int pageSize;

}
