package com.my.utils;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fasterxml.jackson.annotation.JsonView;

public class MultiResultResponse<T> extends RestResponse {

    private static final long serialVersionUID = 1L;

    @JsonView
    private Object result;
    @JsonView
    private List<T> items;
    @JsonView
    private PageInfo pageInfo;

    public MultiResultResponse() {
    }

    public MultiResultResponse(List<T> items) {
        this();
        this.items = items;
    }

    public MultiResultResponse(Page<T> items) {
        this();
        this.items = items.getContent();
        PageBean pageBean = new PageBean(items.getTotalElements(), items.getSize(),
                items.getPageable().getPageNumber());
        pageInfo = new PageInfo(pageBean);
    }

    public MultiResultResponse(List<T> items, PageBean pageBean) {
        this();
        this.items = items;
        if (pageBean != null) {
            this.pageInfo = new PageInfo(pageBean);
        }
    }

    public Object getResult() {
        return result;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
