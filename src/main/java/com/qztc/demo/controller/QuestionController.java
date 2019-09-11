package com.qztc.demo.controller;


import com.qztc.demo.model.Question;
import com.qztc.demo.service.QuestionService;
import com.qztc.demo.vo.StudentCourseListVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Api(tags = "作业疑问")
@RequestMapping("question")
@Controller
public class QuestionController {
    @Resource
    QuestionService questionService;

    @ApiOperation(value = "根据学生的ID查询作业疑问")
    @RequestMapping(value = "/selectByPrimaryKey/{sid}",method = RequestMethod.GET)
    public Question selectStudentCourseByTid(@PathVariable("sid") Integer sid) {
      Question question=questionService.selectByPrimaryKey(sid);
      return question;
    }
}
