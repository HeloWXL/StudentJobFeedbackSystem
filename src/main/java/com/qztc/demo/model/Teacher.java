package com.qztc.demo.model;

import lombok.Data;

/**
 * 教师表
 * @author wangxl
 * @since
 */
@Data
public class Teacher {
    private Integer teacherId;

    private String teacherName;

    private String teacherTno;

    private String teacherPassword;

    private String teacherJobTitle;

    private String teacherProfession;

    private String teacherApartment;

}