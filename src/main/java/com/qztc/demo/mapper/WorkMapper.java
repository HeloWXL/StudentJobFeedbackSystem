package com.qztc.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qztc.demo.model.Work;
import com.qztc.demo.vo.WorkCourseVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WorkMapper extends BaseMapper<Work> {

    int insertSelective(Work record);

    Work selectByPrimaryKey(Integer workId);

    @Select("select w.work_name,c.course_name,w.work_id\n" +
            "from course c ,work w \n" +
            "where c.couser_id = w.course_id and c.couser_id = #{courseId}")
    List<WorkCourseVo> getWorkByCourseId(Integer courseId);

}