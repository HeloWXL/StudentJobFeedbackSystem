package com.qztc.demo.controller;

import com.qztc.demo.model.Assgin;
import com.qztc.demo.model.Course;
import com.qztc.demo.model.Teacher;
import com.qztc.demo.service.AssginService;
import com.qztc.demo.service.CourseService;
import com.qztc.demo.utils.UploadFileUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
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
        assgin.setAssginUrl("/pdf/"+ UploadFileUtils.uploadImage(file));
            int i = assginService.insertSelective(assgin);
            if(i==1){
                map.put("code",200);
            }
        return map;
    }

    @ApiOperation("跳转到作业详情界面")
    @RequestMapping("/toAssginDetail")
    public String toCourseDetail(){
        return "/teacher/assginDetail";
    }

}
