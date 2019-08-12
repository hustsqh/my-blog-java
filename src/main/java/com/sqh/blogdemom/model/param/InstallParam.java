package com.sqh.blogdemom.model.param;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

public class InstallParam {
    @NotEmpty
    private String siteTitle;
    @NotEmpty
    private String siteUrl;
    @Length(min = 4,max = 20)
    private String adminUser;
    @Email
    private String adminEmail;
    @Length(min = 6, max = 14)
    private String adminPwd;

    public String getSiteTitle() {
        return siteTitle;
    }

    public void setSiteTitle(String siteTitle) {
        this.siteTitle = siteTitle;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }
}
