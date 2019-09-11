package com.qztc.demo.controller;


import com.qztc.demo.model.Question;
import com.qztc.demo.service.QuestionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Api(tags = "作业疑问")
@RequestMapping("question")
@Controller
public class QuestionController {
    @Resource
    QuestionService questionService;

    @ApiOperation(value = "根据学生的ID查询作业疑问")
    @RequestMapping(value = "/selectByPrimaryKey/{sid}",method = RequestMethod.GET)
    @ResponseBody
    public Question selectStudentCourseByTid(@PathVariable("sid") Integer sid) {
      Question question=questionService.selectByPrimaryKey(sid);
        return question;
    }
}
