package com.qztc.demo.controller;

import com.qztc.demo.model.Course;
import com.qztc.demo.model.Teacher;
import com.qztc.demo.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangxl
 * @ClassName CourseController
 * @Description TODO
 * @date 2019/9/7 17:12
 * @Version 1.0
 */
@Api(tags = "课程接口")
@RequestMapping("course")
@Controller
public class CourseController {

  @Resource
  private CourseService courseService;

  @ApiOperation(value = "添加课程")
  @RequestMapping(value = "/insertCourse",method = RequestMethod.POST)
  @ResponseBody
  public int insertSelective(@RequestBody Course record, HttpServletRequest request){
    Teacher teacher = (Teacher) request.getSession().getAttribute("teachersession");
    if (teacher == null) {
      System.out.println("教师未登录");
      return 0;
    } else {
      int tid = teacher.getTeacherId();
      record.setTeacherId(tid);
    }
    return courseService.insertSelective(record);
  }

  @ApiOperation(value = "根据教师的ID查询课程")
  @RequestMapping(value = "/selectCourseByTid",method = RequestMethod.GET)
  @ResponseBody
  public Map<String,Object> selectCourseByTid(@RequestParam("tid") Integer tid) {
    return courseService.selectCourseByTid(tid);
  }

}
