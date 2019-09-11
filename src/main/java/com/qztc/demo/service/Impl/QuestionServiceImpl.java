package com.qztc.demo.service.Impl;

import com.qztc.demo.mapper.QuestionMapper;
import com.qztc.demo.model.Question;
import com.qztc.demo.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Resource
    QuestionMapper questionMapper;

    @Override
    public Question selectByPrimaryKey(Integer sid) {
        return questionMapper.selectByPrimaryKey(sid);
    }
}
