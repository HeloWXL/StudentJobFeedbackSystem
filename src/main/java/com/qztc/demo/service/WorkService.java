package com.qztc.demo.service;

import com.qztc.demo.vo.WorkCourseVo;

import java.util.List;

public interface WorkService {
    List<WorkCourseVo> getWorkByCourseId(Integer courseId);
}
