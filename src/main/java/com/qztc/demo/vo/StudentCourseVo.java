package com.qztc.demo.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

@Data
public class StudentCourseVo {
    @TableId(value = "couser_id",type = IdType.AUTO)
    private Integer couserId;

    @TableField("course_name")
    private String courseName;

    @TableField("course_picture")
    private String coursePicture;

    @TableId(value = "student_id",type = IdType.AUTO)
    private Integer studentId;

    private String studentName;

    private String studentSno;

    private String studentProfession;

    private String studentApartment;


}
