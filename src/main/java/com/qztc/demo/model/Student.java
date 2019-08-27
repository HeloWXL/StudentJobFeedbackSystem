package com.qztc.demo.model;

public class Student {
    private Integer studentId;

    private String studentSno;

    private String studentName;

    private String studentPassword;

    private String studentProfession;

    private String studentApartment;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentSno() {
        return studentSno;
    }

    public void setStudentSno(String studentSno) {
        this.studentSno = studentSno == null ? null : studentSno.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword == null ? null : studentPassword.trim();
    }

    public String getStudentProfession() {
        return studentProfession;
    }

    public void setStudentProfession(String studentProfession) {
        this.studentProfession = studentProfession == null ? null : studentProfession.trim();
    }

    public String getStudentApartment() {
        return studentApartment;
    }

    public void setStudentApartment(String studentApartment) {
        this.studentApartment = studentApartment == null ? null : studentApartment.trim();
    }
}