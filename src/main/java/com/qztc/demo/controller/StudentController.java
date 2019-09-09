package com.qztc.demo.controller;

import com.qztc.demo.model.Student;
import com.qztc.demo.service.StudentService;
import com.qztc.demo.utils.ExcelUtil;
import com.qztc.demo.utils.Md5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

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

  @ApiOperation("导入学生名单")
  @PostMapping("/importStudent")
  @ResponseBody
  public String importStudent(@RequestParam("file") MultipartFile file) {
    String fileName = file.getOriginalFilename();
    String pattern = fileName.substring(fileName.lastIndexOf(".") + 1);
    List<List<String>> listContent = new ArrayList<>();
    String message = "导入成功";
    try {
      if (file != null) {
        //文件类型判断
        if (!ExcelUtil.isEXCEL(file)) {
          message="文件为空";
          return message;
        }
        listContent = ExcelUtil.readExcelContents(file, pattern);
        //文件内容判断
        if (listContent.isEmpty()) {
          message="表格内容为空";
          return message;
        }
        studentService.importStudentList(listContent);
      } else {
        message="未选择文件";
        return message;
      }
    } catch (Exception e) {
      message="文件上传出现异常";
      return message;
    }
    return message;
  }

}
