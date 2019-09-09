package com.qztc.demo.service;

import com.qztc.demo.model.Work;
import com.qztc.demo.vo.WorkCourseVo;

import java.util.List;

public interface WorkService {
    List<WorkCourseVo> getWorkByCourseId(Integer courseId);

    /***
     * @Author wangxl
     * @Description 教师发布作业
     * @Date 9:05 下午 2019/9/9
     * @Param [work]
     * @return int
     **/
    int insertSelective(Work work);

}
