package com.qztc.demo.mapper;

import com.qztc.demo.model.Assgin;

public interface AssginMapper {
    int deleteByPrimaryKey(Integer assginId);

    int insert(Assgin record);

    int insertSelective(Assgin record);

    Assgin selectByPrimaryKey(Integer assginId);

    int updateByPrimaryKeySelective(Assgin record);

    int updateByPrimaryKey(Assgin record);
}