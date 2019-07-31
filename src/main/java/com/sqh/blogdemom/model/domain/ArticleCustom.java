package com.sqh.blogdemom.model.domain;

public class ArticleCustom extends Article {
    private String categorys;
    private String tags;
    private String categorysName;
    private String tagsName;
    private String categoroysUrl;
    private String tagsUrl;

    public String getCategorys() {
        return categorys;
    }

    public void setCategorys(String categorys) {
        this.categorys = categorys;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCategorysName() {
        return categorysName;
    }

    public void setCategorysName(String categorysName) {
        this.categorysName = categorysName;
    }

    public String getTagsName() {
        return tagsName;
    }

    public void setTagsName(String tagsName) {
        this.tagsName = tagsName;
    }

    public String getCategoroysUrl() {
        return categoroysUrl;
    }

    public void setCategoroysUrl(String categoroysUrl) {
        this.categoroysUrl = categoroysUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    @Override
    public String toString() {
        return "ArticleCustom{" +
                "categorys='" + categorys + '\'' +
                ", tags='" + tags + '\'' +
                ", categorysName='" + categorysName + '\'' +
                ", tagsName='" + tagsName + '\'' +
                ", categoroysUrl='" + categoroysUrl + '\'' +
                ", tagsUrl='" + tagsUrl + '\'' +
                '}';
    }
}
