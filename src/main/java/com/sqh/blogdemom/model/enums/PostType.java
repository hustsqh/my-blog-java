package com.sqh.blogdemom.model.enums;

public enum  PostType {
    POST_TYPE_POST("post"),
    POST_TYPE_PAGE("page");
    private String value;

    PostType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
