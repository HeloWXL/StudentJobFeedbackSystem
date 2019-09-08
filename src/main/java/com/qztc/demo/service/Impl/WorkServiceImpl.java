package com.qztc.demo.service.Impl;

import com.qztc.demo.mapper.WorkMapper;
import com.qztc.demo.service.WorkService;
import com.qztc.demo.vo.WorkCourseVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Resource
    private WorkMapper workMapper;

    @Override
    public List<WorkCourseVo> getWorkByCourseId(Integer courseId) {
        return workMapper.getWorkByCourseId(courseId);
    }
}
