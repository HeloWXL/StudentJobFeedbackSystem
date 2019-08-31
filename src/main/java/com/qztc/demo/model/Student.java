package com.qztc.demo.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

/**
 * 学生表
 * @author wangxl
 * @since
 */
@Data
@TableName(value = "student")
public class Student {
    @TableId(value = "student_id",type = IdType.AUTO)
    private Integer studentId;

    @TableField("student_sno")
    private String studentSno;

    @TableField("student_name")
    private String studentName;

    @TableField("student_password")
    private String studentPassword;

    @TableField("student_profession")
    private String studentProfession;

    @TableField("student_apartment")
    private String studentApartment;
}