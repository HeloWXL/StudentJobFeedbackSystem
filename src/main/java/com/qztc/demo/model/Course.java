package com.qztc.demo.model;

public class Course {
    private Integer couserId;

    private String courseName;

    private String coursePicture;

    private Integer teacherId;

    public Integer getCouserId() {
        return couserId;
    }

    public void setCouserId(Integer couserId) {
        this.couserId = couserId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCoursePicture() {
        return coursePicture;
    }

    public void setCoursePicture(String coursePicture) {
        this.coursePicture = coursePicture == null ? null : coursePicture.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}