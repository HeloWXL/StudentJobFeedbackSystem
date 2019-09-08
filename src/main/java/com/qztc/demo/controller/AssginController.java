package com.qztc.demo.controller;

import com.qztc.demo.model.Course;
import com.qztc.demo.model.Teacher;
import com.qztc.demo.service.AssginService;
import com.qztc.demo.service.CourseService;
import com.qztc.demo.utils.UploadFileUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
    public Map<String,Object> insertSelective(@RequestParam(value="file") MultipartFile file, @RequestParam("classes") String classId,
                                              @RequestParam("courseName") String courseName, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
//        Teacher teacher = (Teacher) request.getSession().getAttribute("teachersession");
//        if (teacher == null) {
//            System.out.println("教师未登录");
//            return null;
//        } else {
//            int tid = teacher.getTeacherId();
//            Course course = new Course();
//            course.setCourseName(courseName);
//            course.setClassId(Integer.valueOf(classId));
//            course.setTeacherId(tid);
//            course.setCoursePicture("/imgages/course/"+ UploadFileUtils.uploadImage(file));
//            int i = assginService.insertSelective(course);
//            if(i==1){
//                map.put("code",200);
//            }
//
//        }
        return map;
    }

}
