package com.sqh.blogdemom.model.domain;

public class ArticleCategory {
    private Integer articleId;
    private Long categoryId;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "ArticleCategory{" +
                "articleId=" + articleId +
                ", categoryId=" + categoryId +
                '}';
    }
}
