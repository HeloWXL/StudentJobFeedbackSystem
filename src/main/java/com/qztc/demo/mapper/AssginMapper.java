package com.qztc.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qztc.demo.model.Assgin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AssginMapper extends BaseMapper<Assgin> {

    /**
     * 学生作业提交表
     * @param record
     * @return int
     */
    int insertSelective(Assgin record);
}