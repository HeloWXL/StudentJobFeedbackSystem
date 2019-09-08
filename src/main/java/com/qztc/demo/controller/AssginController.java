package com.qztc.demo.controller;

import com.qztc.demo.model.Assgin;
import com.qztc.demo.model.Course;
import com.qztc.demo.model.Teacher;
import com.qztc.demo.service.AssginService;
import com.qztc.demo.service.CourseService;
import com.qztc.demo.utils.UploadFileUtils;
import com.qztc.demo.vo.AssginStudentVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "学生作业提交接口")
@RequestMapping("assgin")
@Controller
public class AssginController {

    @Resource
    private AssginService assginService;

    @ApiOperation(value = "提交作业")
    @RequestMapping(value = "/insertAssgin",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertSelective(@RequestParam(value="file") MultipartFile file, @RequestParam("workId") Integer workId,
                                              @RequestParam("studentId") Integer studentId){
        Map<String,Object> map = new HashMap<>();
            Assgin assgin = new Assgin();
            assgin.setStudentId(studentId);
            assgin.setWorkId(workId);
        assgin.setAssginUrl("/resources/pdf/"+ UploadFileUtils.uploadPdf(file));
            int i = assginService.insertSelective(assgin);
            if(i==1){
                map.put("code",200);
            }
        return map;
    }

    @ApiOperation("根据作业的ID查询学生作业提交情况")
    @RequestMapping("/getAssginByWorkId/{workId}")
    public String getAssginByWorkId(@PathVariable Integer workId, Model model){
        List<AssginStudentVo> assginStudentVoList = assginService.getAssginByWorkId(workId);
        model.addAttribute("assginStudentVoList",assginStudentVoList);
        return "/teacher/assginDetail";
    }

}
