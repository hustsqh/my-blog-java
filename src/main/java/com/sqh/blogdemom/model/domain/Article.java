package com.sqh.blogdemom.model.domain;

import java.util.Date;

public class Article {
    private Integer id;
    private Integer userId;
    private String articleContent;
    private String articleContentMd;
    private Date articleNewsTime;
    private Integer articleStatus;
    private String articleSummary;
    private String articleThumbnail;
    private String articleTitle;
    private Integer articleType;
    private String articlePost;
    private Integer articleComment;
    private Date articleUpdateTime;
    private String articleUrl;
    private Long articleViews;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleContentMd() {
        return articleContentMd;
    }

    public void setArticleContentMd(String articleContentMd) {
        this.articleContentMd = articleContentMd;
    }

    public Date getArticleNewsTime() {
        return articleNewsTime;
    }

    public void setArticleNewsTime(Date articleNewsTime) {
        this.articleNewsTime = articleNewsTime;
    }

    public Integer getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

    public String getArticleThumbnail() {
        return articleThumbnail;
    }

    public void setArticleThumbnail(String articleThumbnail) {
        this.articleThumbnail = articleThumbnail;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public String getArticlePost() {
        return articlePost;
    }

    public void setArticlePost(String articlePost) {
        this.articlePost = articlePost;
    }

    public Integer getArticleComment() {
        return articleComment;
    }

    public void setArticleComment(Integer articleComment) {
        this.articleComment = articleComment;
    }

    public Date getArticleUpdateTime() {
        return articleUpdateTime;
    }

    public void setArticleUpdateTime(Date articleUpdateTime) {
        this.articleUpdateTime = articleUpdateTime;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public Long getArticleViews() {
        return articleViews;
    }

    public void setArticleViews(Long articleViews) {
        this.articleViews = articleViews;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", userId=" + userId +
                ", articleContent='" + articleContent + '\'' +
                ", articleContentMd='" + articleContentMd + '\'' +
                ", articleNewsTime=" + articleNewsTime +
                ", articleStatus=" + articleStatus +
                ", articleSummary='" + articleSummary + '\'' +
                ", articleThumbnail='" + articleThumbnail + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleType=" + articleType +
                ", articlePost='" + articlePost + '\'' +
                ", articleComment=" + articleComment +
                ", articleUpdateTime=" + articleUpdateTime +
                ", articleUrl='" + articleUrl + '\'' +
                ", articleViews=" + articleViews +
                '}';
    }
}
