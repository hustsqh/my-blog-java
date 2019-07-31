package com.sqh.blogdemom.model.domain;

import java.util.Date;

public class Log {
    private Integer logId;
    private String logTitle;
    private String logContent;
    private String logIp;
    private Date logDate;

    public Log(Integer logId, String logTitle, String logContent, String logIp, Date logDate) {
        this.logId = logId;
        this.logTitle = logTitle;
        this.logContent = logContent;
        this.logIp = logIp;
        this.logDate = logDate;
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogTitle() {
        return logTitle;
    }

    public void setLogTitle(String logTitle) {
        this.logTitle = logTitle;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }
}
