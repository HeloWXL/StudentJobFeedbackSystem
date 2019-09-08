package com.qztc.demo.service;

import com.qztc.demo.model.Assgin;

public interface AssginService {


    /**
     * 学生作业提交表
     * @param record
     * @return int
     */
    int insertSelective(Assgin record);
}
