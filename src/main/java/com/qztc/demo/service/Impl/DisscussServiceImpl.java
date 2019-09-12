package com.qztc.demo.service.Impl;

import com.qztc.demo.mapper.DiscussMapper;
import com.qztc.demo.service.DisscussService;
import com.qztc.demo.vo.DiscussCommentListVo;
import com.qztc.demo.vo.DiscussCommentVo;
import com.qztc.demo.vo.StudentCourseVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DisscussServiceImpl implements DisscussService {
    @Resource
    private DiscussMapper discussMapper;

    @Override
    public  List<DiscussCommentVo> selectDiscussByStudentId(Integer sid) {
        List<DiscussCommentVo> list = discussMapper.selectDiscussByStudentId(sid);
        return list;
    }

    @Override
    public int countDiscussByStudent(Integer sid) {
        return discussMapper.countDiscussByStudent(sid);
    }
}
