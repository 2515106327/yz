package com.coal.cn.query;

import lombok.Data;

/**
 * @author wencheng
 * @since 2019-06-25
 */
@Data
public class PageQuery {
    /**
     * 当前页码（从1开始）
     */
    private Integer pageNumber;
    /**
     * 每页大小
     */
    private Integer pageSize;

    public PageQuery() {
    }

    public PageQuery(Integer page, Integer rows) {
        this.pageNumber = page;
        this.pageSize = rows;
    }


    public Integer getStart() {
        return (pageNumber - 1) * pageSize;
    }

    public int getPage() {
        return pageNumber;
    }

    public int getRows() {
        return pageSize;
    }
}