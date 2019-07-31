package com.sqh.blogdemom.model.enums;

public enum PageNumber {
    POST_INDEX_LIMIT(12);

    int limit;

    PageNumber(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
