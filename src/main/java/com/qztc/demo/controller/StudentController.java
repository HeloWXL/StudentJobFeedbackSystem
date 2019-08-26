package com.qztc.demo.controller;

import com.qztc.demo.model.Student;
import com.qztc.demo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author wangxl
 * @ClassName HelloController
 * @Description TODO
 * @date 2019/8/26 23:43
 * @Version 1.0
 */
@Api(value = "学生接口")
@Controller
public class StudentController {


  @Autowired
  private StudentService studentService;

  @ApiOperation("查询所有学生")
  @RequestMapping("/student")
  public String hello(Model model) {
    List<Student> studentList = studentService.selectAll();
    model.addAttribute("studentList",studentList);
    return "student";
  }



}
