package com.qztc.demo.controller;

import com.qztc.demo.model.Student;
import com.qztc.demo.service.StudentService;

import com.qztc.demo.utils  .Md5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author wangxl
 * @ClassName StudentController
 * @Description TODO
 * @date 2019/8/29 22:26
 * @Version 1.0
 */
@Api(tags = "学生接口")
@RequestMapping("student")
@Controller
public class StudentController {

  @Resource
  private StudentService studentService;

  @GetMapping("/toStudentLogin")
  public String toLogin(){
    return "/student/login";
  }

  @GetMapping("/toStudentIndex")
  public String toStudentIndex(){ return "/student/index";}

  @ApiOperation(value = "学生登录")
  @RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
  @ResponseBody
  public boolean checkLogin(@RequestParam("sno") String sno , @RequestParam("password") String password,HttpServletRequest request){
     if(Md5Utils.getSaltverifyMD5(password,studentService.selectBySno(sno).getStudentPassword())){
       Student student = studentService.selectBySno(sno);
       request.getSession().setAttribute("studentsession",student);
       return true;
     }else{
       return false;
     }
  }

  @ApiOperation(value = "添加学生信息")
  @PostMapping("/insertStudent")
  @ResponseBody
  public Integer insertStudent(@RequestBody Student student){
    student.setStudentPassword(Md5Utils.getSaltMD5(student.getStudentPassword()));
    return studentService.insertSelective(student);
  }



  @ApiOperation(value = "获取学生的session对象")
  @PostMapping("getStudentSession")
  public Student getStudentSession(HttpServletRequest request, @RequestParam("studentBean") String studentBean){
    Student student = (Student) request.getSession().getAttribute(studentBean);
    if (student == null) {
      return null;
    } else {
      return student;
    }
  }


  @ApiOperation(value = "清除学生的session对象")
  @GetMapping("/removeStudentSession")
  public void removeStudentSession(HttpServletRequest request, HttpServletResponse response){
    request.getSession().removeAttribute("studentsession");
    if ( request.getSession().getAttribute("studentsession") == null) {
      try {
        response.sendRedirect("/toLogin");
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }


}
