package com.qztc.demo.service.Impl;

import com.qztc.demo.mapper.AssginMapper;
import com.qztc.demo.model.Assgin;
import com.qztc.demo.service.AssginService;
import com.qztc.demo.vo.AssginStudentVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public List<AssginStudentVo> getAssginByWorkId(Integer workId) {
        return null;
    }
}
