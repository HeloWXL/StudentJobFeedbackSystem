package com.qztc.demo.mapper;

import com.qztc.demo.model.RankSumScore;

public interface RankSumScoreMapper {
    int deleteByPrimaryKey(Integer rankSumScoreId);

    int insert(RankSumScore record);

    int insertSelective(RankSumScore record);

    RankSumScore selectByPrimaryKey(Integer rankSumScoreId);

    int updateByPrimaryKeySelective(RankSumScore record);

    int updateByPrimaryKey(RankSumScore record);
}