package com.qztc.demo.controller;


import com.qztc.demo.model.Course;
import com.qztc.demo.model.Teacher;
import com.qztc.demo.service.CourseService;
import com.qztc.demo.utils.UploadFileUtils;
import com.qztc.demo.vo.StudentCourseListVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
  public Map<String,Object> insertSelective(@RequestParam(value="file") MultipartFile file,@RequestParam("classes") String classId,
                             @RequestParam("courseName") String courseName, HttpServletRequest request){
    Map<String,Object> map = new HashMap<>();
    Teacher teacher = (Teacher) request.getSession().getAttribute("teachersession");
    if (teacher == null) {
      System.out.println("教师未登录");
      return null;
    } else {
      int tid = teacher.getTeacherId();
      Course course = new Course();
      course.setCourseName(courseName);
      course.setClassId(Integer.valueOf(classId));
      course.setTeacherId(tid);
      course.setCoursePicture("/resources/images/course/"+UploadFileUtils.uploadImage(file));
      int i = courseService.insertSelective(course);
      if(i==1){
        map.put("code",200);
      }

    }
    return map;
  }

  @ApiOperation(value = "根据学生的ID查询课程")
  @RequestMapping(value = "/selectStudentCourseByTid/{sid}",method = RequestMethod.GET)
  public String selectStudentCourseByTid(@PathVariable("sid") Integer sid,Model model) {
      StudentCourseListVo studentCourseListVo =courseService.selectStudentCourseByTid(sid);
      model.addAttribute("studentCourseListVo",studentCourseListVo);
      return "/student/courseDetail";
  }


}
