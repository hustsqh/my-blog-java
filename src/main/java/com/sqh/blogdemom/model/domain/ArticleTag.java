package com.sqh.blogdemom.model.domain;

public class ArticleTag {
    private Integer articleId;
    private Long tagId;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    @Override
    public String toString() {
        return "ArticleTag{" +
                "articleId=" + articleId +
                ", tagId=" + tagId +
                '}';
    }
}
