package com.example.springboot3study.entity.page;

/**
 * @author 封心
 */
public class PageReq<T> {

    private Integer pageNumber;

    private Integer pageSize;

    private T pageData;

    private String sort;

    public PageReq() {
    }

    public PageReq(Integer pageNumber, Integer pageSize, T pageData, String sort) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pageData = pageData;
        this.sort = sort;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public T getPageData() {
        return pageData;
    }

    public void setPageData(T pageData) {
        this.pageData = pageData;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
