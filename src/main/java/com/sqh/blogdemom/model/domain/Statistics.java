package com.sqh.blogdemom.model.domain;

import java.io.Serializable;

public class Statistics implements Serializable {
    private static final long serialVersionUID = 2329863829741481287L;
    private long articles;
    private long pages;
    private long comments;
    private long categories;
    private long tags;
    private long attaches;

    public long getArticles() {
        return articles;
    }

    public void setArticles(long articles) {
        this.articles = articles;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public long getComments() {
        return comments;
    }

    public void setComments(long comments) {
        this.comments = comments;
    }

    public long getCategories() {
        return categories;
    }

    public void setCategories(long categories) {
        this.categories = categories;
    }

    public long getTags() {
        return tags;
    }

    public void setTags(long tags) {
        this.tags = tags;
    }

    public long getAttaches() {
        return attaches;
    }

    public void setAttaches(long attaches) {
        this.attaches = attaches;
    }
}
