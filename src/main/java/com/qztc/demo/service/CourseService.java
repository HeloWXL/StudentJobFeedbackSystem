package com.qztc.demo.service;

import com.qztc.demo.model.Course;
import com.qztc.demo.vo.StudentCourseListVo;

import java.util.List;
import java.util.Map;

public interface CourseService {
  /**
   * 添加课程
   * @param record
   * @return
   */
  int insertSelective(Course record);

  /**
   * 根据教师的ID查询教师的课程信息
   * @param tid
   * @return
   */
  Map<String,Object> selectCourseByTid(Integer tid);

  /**
   * 根据学生的ID查询学生的课程信息
   */
  StudentCourseListVo selectStudentCourseByTid(Integer sid);
}
