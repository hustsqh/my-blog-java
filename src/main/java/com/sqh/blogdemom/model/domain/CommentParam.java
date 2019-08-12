package com.sqh.blogdemom.model.domain;

public class CommentParam extends PageParam {
    private Integer excludeUID;

    public Integer getExcludeUID() {
        return excludeUID;
    }

    public void setExcludeUID(Integer excludeUID) {
        this.excludeUID = excludeUID;
    }
}
