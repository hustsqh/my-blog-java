package com.sqh.blogdemom.model.domain;

import java.util.Date;

public class Attachment {
    private Integer id;
    private String pictureName;
    private String picturePath;
    private String pictureSmallPath;
    private String pictureType;
    private Date pictureCreateDate;
    private String pictureSize;
    private String pictureSuffix;
    private String pictureWh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getPictureSmallPath() {
        return pictureSmallPath;
    }

    public void setPictureSmallPath(String pictureSmallPath) {
        this.pictureSmallPath = pictureSmallPath;
    }

    public String getPictureType() {
        return pictureType;
    }

    public void setPictureType(String pictureType) {
        this.pictureType = pictureType;
    }

    public Date getPictureCreateDate() {
        return pictureCreateDate;
    }

    public void setPictureCreateDate(Date pictureCreateDate) {
        this.pictureCreateDate = pictureCreateDate;
    }

    public String getPictureSize() {
        return pictureSize;
    }

    public void setPictureSize(String pictureSize) {
        this.pictureSize = pictureSize;
    }

    public String getPictureSuffix() {
        return pictureSuffix;
    }

    public void setPictureSuffix(String pictureSuffix) {
        this.pictureSuffix = pictureSuffix;
    }

    public String getPictureWh() {
        return pictureWh;
    }

    public void setPictureWh(String pictureWh) {
        this.pictureWh = pictureWh;
    }
}
