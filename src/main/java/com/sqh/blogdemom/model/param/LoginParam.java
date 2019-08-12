package com.sqh.blogdemom.model.param;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class LoginParam {
    @NotEmpty
    @Length(min = 4, max = 20)
    private String username;
    @NotEmpty
    @Length(min = 6, max = 14)
    private String password;
    
    private String rememberMe;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(String rememberMe) {
        this.rememberMe = rememberMe;
    }
}
