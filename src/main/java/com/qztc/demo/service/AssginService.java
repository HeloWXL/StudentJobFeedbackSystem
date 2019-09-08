package com.qztc.demo.service;

import com.qztc.demo.model.Assgin;
import com.qztc.demo.vo.AssginStudentVo;

import java.util.List;

public interface AssginService {


    /**
     * 学生作业提交表
     * @param record
     * @return int
     */
    int insertSelective(Assgin record);

    /**
     * @Author wangxl
     * @Description 根据作业ID查询学生提交作业情况
     * @Date 2:01 下午 2019/9/8
     * @Param [workId]
     * @return java.util.List<com.qztc.demo.vo.AssginStudentVo>
     **/
    List<AssginStudentVo> getAssginByWorkId(Integer workId);
}
