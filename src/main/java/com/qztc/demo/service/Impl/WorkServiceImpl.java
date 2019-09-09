package com.qztc.demo.service.Impl;

import com.qztc.demo.mapper.WorkMapper;
import com.qztc.demo.model.Work;
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

    /***
     * @Author wangxl
     * @Description
     * @Date 9:24 下午 2019/9/9
     * @Param [work]
     * @return int
     **/
    @Override
    public int insertSelective(Work work) {
        return workMapper.insertSelective(work);
    }
}
