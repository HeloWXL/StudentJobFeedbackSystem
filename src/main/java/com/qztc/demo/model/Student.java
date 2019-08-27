package com.qztc.demo.model;

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

    private String studentSno;

    private String studentName;

    private String studentPassword;

    private String studentProfession;

    private String studentApartment;
}