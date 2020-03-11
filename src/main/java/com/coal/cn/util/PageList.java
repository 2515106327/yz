package com.coal.cn.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//分页工具：
// 1、easyui只需2个属性，total(总数),datas（分页数据）就能实现分页
// 2、layui 需4个属性，code,msg,pageCount(总数),data（分页数据）实现分页
@Data
public class PageList<T> {

    private int code=200;
    private String msg;

    private long pageCount;//总条数
    private long currentPage;//总条数
    private long counts;//总条数
    private List<T> data = new ArrayList<>();//装前台当前页的数据

    //提供有参构造方法，方便测试
    public PageList(long pageCount, long currentPage, List<T> data) {
        this.pageCount = pageCount;
        this.currentPage = currentPage;
        this.data = data;
    }
    //提供有参构造方法，方便测试
    public PageList(long pageCount, List<T> data) {
        this.pageCount = pageCount;
        this.data = data;
    }
    //除了有参构造方法，还需要提供一个无参构造方法
    public PageList() { }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PageList{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", pageCount=" + pageCount +
                ", data=" + data +
                '}';
    }
}
