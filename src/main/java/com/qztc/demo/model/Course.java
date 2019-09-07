package com.qztc.demo.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

/**
 * 课程表
 * @author wangxl
 * @since
 */
@Data
@TableName(value = "course")
public class Course {
    @TableId(value = "course_id",type = IdType.AUTO)
    private Integer couserId;

    @TableField("course_name")
    private String courseName;

    @TableField("course_picture")
    private String coursePicture;

    @TableField("teacher_id")
    private Integer teacherId;

    @TableField("class_id")
    private Integer classId;
}