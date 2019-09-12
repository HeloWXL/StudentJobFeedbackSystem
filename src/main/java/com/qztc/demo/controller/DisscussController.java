package com.qztc.demo.controller;

import com.qztc.demo.service.DisscussService;
import com.qztc.demo.vo.DiscussCommentListVo;
import com.qztc.demo.vo.DiscussCommentVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Api(tags = "学生讨论提交接口")
@RequestMapping("disscuss")
@Controller
public class DisscussController {
    @Resource
    private DisscussService disscussService;

    @ApiOperation(value = "查询讨论内容")
    @RequestMapping(value = "/selectDiscussByStudentId",method = RequestMethod.POST)
    @ResponseBody
    private DiscussCommentListVo selectDiscussByStudentId( @RequestParam("sid") Integer sid){
        DiscussCommentListVo discussCommentListVo=new DiscussCommentListVo();
        List<DiscussCommentVo> list = disscussService.selectDiscussByStudentId(sid);
        int count=disscussService.countDiscussByStudent(sid);
        discussCommentListVo.setList(list);
        discussCommentListVo.setCount(count);
        return discussCommentListVo;
    }

}
