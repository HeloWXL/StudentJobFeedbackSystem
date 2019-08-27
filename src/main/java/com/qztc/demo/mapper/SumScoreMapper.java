package com.qztc.demo.mapper;

import com.qztc.demo.model.SumScore;

public interface SumScoreMapper {
    int deleteByPrimaryKey(Integer sumScoreId);

    int insert(SumScore record);

    int insertSelective(SumScore record);

    SumScore selectByPrimaryKey(Integer sumScoreId);

    int updateByPrimaryKeySelective(SumScore record);

    int updateByPrimaryKey(SumScore record);
}