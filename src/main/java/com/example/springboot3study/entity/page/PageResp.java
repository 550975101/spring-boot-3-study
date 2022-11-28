package com.example.springboot3study.entity.page;

import java.util.List;

/**
 * @author 封心
 */
public class PageResp<T> {

    private Integer totalPage;

    private Integer totalNum;

    private Integer pageNumber;

    private List<T> data;

    public PageResp() {
    }

    public PageResp(Integer totalPage, Integer totalNum, Integer pageNumber, List<T> data) {
        this.totalPage = totalPage;
        this.totalNum = totalNum;
        this.pageNumber = pageNumber;
        this.data = data;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
