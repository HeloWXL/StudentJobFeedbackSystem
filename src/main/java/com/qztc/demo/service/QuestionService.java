package com.qztc.demo.service;

import com.qztc.demo.model.Question;

public interface QuestionService {
    Question selectByPrimaryKey(Integer sid);

    int insertSelective(Question record);
}
