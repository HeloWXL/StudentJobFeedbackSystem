package com.qztc.demo.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

/**
 * 教师表
 * @author wangxl
 * @since
 */
@Data
@TableName(value = "teacher")
public class Teacher {
    @TableId(value = "teacher_id",type = IdType.AUTO)
    private Integer teacherId;

    private String teacherName;

    private String teacherTno;

    private String teacherPassword;

    private String teacherJobTitle;

    private String teacherProfession;

    private String teacherApartment;

}