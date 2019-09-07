package com.qztc.demo.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

@Data
public class StudentCourseVo {
    @TableId(value = "course_id",type = IdType.AUTO)
    private Integer couserId;

    @TableField("course_name")
    private String courseName;

    @TableField("course_picture")
    private String coursePicture;

    @TableId(value = "student_id",type = IdType.AUTO)
    private Integer studentId;

    private String student_name;

    private String student_sno;

    private String student_profession;

    private String student_apartment;


}
