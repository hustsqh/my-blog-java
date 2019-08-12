package com.sqh.blogdemom.model.domain;

public class PageParam {
    private Integer page = 1;
    private Integer limit = 12;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
