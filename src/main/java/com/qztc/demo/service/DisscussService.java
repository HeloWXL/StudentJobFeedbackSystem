package com.qztc.demo.service;

import com.qztc.demo.vo.DiscussCommentListVo;
import com.qztc.demo.vo.DiscussCommentVo;
import com.qztc.demo.vo.StudentCourseVo;

import java.util.List;

public interface DisscussService {

    List<DiscussCommentVo> selectDiscussByStudentId(Integer sid);

    int countDiscussByStudent(Integer sid);
}
