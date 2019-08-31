package com.qztc.demo.controller;

import com.qztc.demo.model.Student;
import com.qztc.demo.model.Teacher;
import com.qztc.demo.service.StudentService;
import com.qztc.demo.service.TeacherService;
import com.qztc.demo.utils.Md5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangxl
 * @ClassName TeacherController
 * @Description TODO
 * @date 2019/8/31 17:28
 * @Version 1.0
 */
@Api(tags = "教师接口")
@RequestMapping("teacher")
@Controller
public class TeacherController {
  @Autowired
  private TeacherService teacherService;

  @GetMapping("/toTeacherLogin")
  public String toLogin(){
    return "/teacher/login";
  }


  @ApiOperation(value = "教师登录")
  @RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
  @ResponseBody
  public boolean checkLogin(@RequestParam("tno") String tno , @RequestParam("psssword") String password, HttpServletRequest request){
    if(Md5Utils.getSaltverifyMD5(password,teacherService.selectByTno(tno).getTeacherPassword())){
      Teacher teacher = teacherService.selectByTno(tno);
      request.getSession().setAttribute("teachersession",teacher);
      return true;
    }else{
      return false;
    }
  }

  @ApiOperation(value = "添加教师信息")
  @PostMapping("/insertTeacher")
  @ResponseBody
  public Integer insertTeacher(@RequestBody Teacher teacher){
    teacher.setTeacherPassword(Md5Utils.getSaltMD5(teacher.getTeacherPassword()));
    return teacherService.insertSelective(teacher);
  }



  @ApiOperation(value = "获取教师的session对象")
  @PostMapping("getTeacherSession")
  public Teacher getStudentSession(HttpServletRequest request, @RequestParam("teacherBean") String teacherBean){
    Teacher teacher = (Teacher) request.getSession().getAttribute(teacherBean);
    if (teacher == null) {
      return null;
    } else {
      return teacher;
    }
  }


  @ApiOperation(value = "清除教师的session对象")
  @GetMapping("/removeTeacherSession")
  public void removeStudentSession(HttpServletRequest request, HttpServletResponse response){
      request.getSession().removeAttribute("teachersession");
    if ( request.getSession().getAttribute("teachersession") == null) {
      try {
        response.sendRedirect("/toLogin");
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
