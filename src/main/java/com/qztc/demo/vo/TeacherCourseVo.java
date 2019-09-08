package com.qztc.demo.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.qztc.demo.model.Teacher;
import lombok.Data;

/**
 * @author wangxl
 * @ClassName TeacherCourseVo
 * @Description TODO
 * @date 2019/9/7 17:49
 * @Version 1.0
 */
@Data
public class TeacherCourseVo {

  @TableId(value = "couser_id",type = IdType.AUTO)
  private Integer couserId;

  @TableField("course_name")
  private String courseName;

  @TableField("course_picture")
  private String coursePicture;

  @TableId(value = "teacher_id",type = IdType.AUTO)
  private Integer teacherId;

  private String teacherName;

  private String teacherTno;

  private String teacherPassword;

  private String teacherJobTitle;

  private String teacherProfession;

  private String teacherApartment;

  @TableId(value = "class_id",type = IdType.AUTO)
  private String classId;

  private String className;
}
