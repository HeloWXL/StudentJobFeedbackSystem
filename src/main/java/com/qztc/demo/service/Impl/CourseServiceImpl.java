package com.qztc.demo.service.Impl;

import com.qztc.demo.mapper.CourseMapper;
import com.qztc.demo.model.Course;
import com.qztc.demo.service.CourseService;
import com.qztc.demo.vo.StudentCourseVo;
import com.qztc.demo.vo.TeacherCourseVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangxl
 * @ClassName CourseServiceImpl
 * @Description TODO
 * @date 2019/9/7 17:07
 * @Version 1.0
 */
@Service
public class CourseServiceImpl implements CourseService {

  @Resource
  private CourseMapper courseMapper;

  /**
   * 添加课程
   * @param record
   * @return
   */
  @Override
  public int insertSelective(Course record){
    return courseMapper.insertSelective(record);
  }

  @Override
  public Map<String,Object> selectCourseByTid(Integer tid) {
    Map<String,Object> map = new HashMap<>();
    List<TeacherCourseVo>  courseList = courseMapper.selectCourseByTid(tid);
    map.put("data",courseList);
    int count  = courseMapper.CountCourseForStu(tid);
    map.put("count",count);
    return map;
  }

  @Override
  public Map<String, Object> selectStudentCourseByTid(Integer sid) {
    Map<String,Object> map = new HashMap<>();
    List<StudentCourseVo>  courseList = courseMapper.selectStudentCourseByTid(sid);
    map.put("data",courseList);
    int count  = courseMapper.CountCourseForStudent(sid);
    map.put("count",count);
    return map;
  }
}
