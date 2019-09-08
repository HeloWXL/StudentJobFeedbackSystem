package com.qztc.demo.controller;

import com.qztc.demo.service.CourseService;
import com.qztc.demo.service.WorkService;
import com.qztc.demo.vo.WorkCourseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "作业接口")
@RequestMapping("work")
@Controller
public class WorkController {

    @Resource
    private WorkService workService;

    @ApiOperation(value = "根据课程的ID查询作业的列表")
    @GetMapping("/getWorkByCourseId/{courseId}")
    public String getWorkByCourseId(@PathVariable("courseId") Integer courseId, Model model){
        List<WorkCourseVo> workCourseVoList = workService.getWorkByCourseId(courseId);
        model.addAttribute("workCourseVoList",workCourseVoList);
        return "/teacher/courseDetail";
    }

}
