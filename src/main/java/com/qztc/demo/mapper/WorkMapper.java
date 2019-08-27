package com.qztc.demo.mapper;

import com.qztc.demo.model.Work;

public interface WorkMapper {
    int deleteByPrimaryKey(Integer workId);

    int insert(Work record);

    int insertSelective(Work record);

    Work selectByPrimaryKey(Integer workId);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKey(Work record);
}