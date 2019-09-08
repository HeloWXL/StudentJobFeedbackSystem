package com.qztc.demo.service.Impl;

import com.qztc.demo.mapper.AssginMapper;
import com.qztc.demo.model.Assgin;
import com.qztc.demo.service.AssginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AssginServiceImpl implements AssginService {

    @Resource
    private AssginMapper assginMapper;

    /**
     * 学生作业提交表
     * @param record
     * @return int
     */
    @Override
    public int insertSelective(Assgin record) {
        return assginMapper.insertSelective(record);
    }
}
