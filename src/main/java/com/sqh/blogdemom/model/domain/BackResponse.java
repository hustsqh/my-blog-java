package com.sqh.blogdemom.model.domain;

import java.io.Serializable;

public class BackResponse implements Serializable {
    private static final long serialVersionUID = 5992812699862539321L;
    private String attach_path;
    private String theme_path;
    private String sql_path;

    public String getAttach_path() {
        return attach_path;
    }

    public void setAttach_path(String attach_path) {
        this.attach_path = attach_path;
    }

    public String getTheme_path() {
        return theme_path;
    }

    public void setTheme_path(String theme_path) {
        this.theme_path = theme_path;
    }

    public String getSql_path() {
        return sql_path;
    }

    public void setSql_path(String sql_path) {
        this.sql_path = sql_path;
    }
}
