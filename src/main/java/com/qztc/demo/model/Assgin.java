package com.qztc.demo.model;

import java.util.Date;

public class Assgin {
    private Integer assginId;

    private Integer workId;

    private Integer studentId;

    private String assginUrl;

    private Date createTime;

    public Integer getAssginId() {
        return assginId;
    }

    public void setAssginId(Integer assginId) {
        this.assginId = assginId;
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getAssginUrl() {
        return assginUrl;
    }

    public void setAssginUrl(String assginUrl) {
        this.assginUrl = assginUrl == null ? null : assginUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}