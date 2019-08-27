package com.qztc.demo.mapper;

import com.qztc.demo.model.Rank;

public interface RankMapper {
    int deleteByPrimaryKey(Integer rankId);

    int insert(Rank record);

    int insertSelective(Rank record);

    Rank selectByPrimaryKey(Integer rankId);

    int updateByPrimaryKeySelective(Rank record);

    int updateByPrimaryKey(Rank record);
}