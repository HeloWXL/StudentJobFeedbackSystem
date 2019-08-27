package com.qztc.demo.model;

public class Teacher {
    private Integer teacherId;

    private String teacherName;

    private String teacherTno;

    private String teacherPassword;

    private String teacherJobTitle;

    private String teacherProfession;

    private String teacherApartment;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getTeacherTno() {
        return teacherTno;
    }

    public void setTeacherTno(String teacherTno) {
        this.teacherTno = teacherTno == null ? null : teacherTno.trim();
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword == null ? null : teacherPassword.trim();
    }

    public String getTeacherJobTitle() {
        return teacherJobTitle;
    }

    public void setTeacherJobTitle(String teacherJobTitle) {
        this.teacherJobTitle = teacherJobTitle == null ? null : teacherJobTitle.trim();
    }

    public String getTeacherProfession() {
        return teacherProfession;
    }

    public void setTeacherProfession(String teacherProfession) {
        this.teacherProfession = teacherProfession == null ? null : teacherProfession.trim();
    }

    public String getTeacherApartment() {
        return teacherApartment;
    }

    public void setTeacherApartment(String teacherApartment) {
        this.teacherApartment = teacherApartment == null ? null : teacherApartment.trim();
    }
}