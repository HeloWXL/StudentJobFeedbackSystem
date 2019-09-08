package com.qztc.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qztc.demo.model.Assgin;
import com.qztc.demo.vo.AssginStudentVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AssginMapper extends BaseMapper<Assgin> {

    /**
     * 学生作业提交表
     * @param record
     * @return int
     */
    int insertSelective(Assgin record);

    @Select("select a.create_time , s.student_name,s.student_sno,a.assgin_id\n" +
            "from work w , assgin a ,student s\n" +
            "where a.work_id = w.work_id and s.student_id = a.student_id and w.work_id = #{workId}")
    List<AssginStudentVo> getAssginByWorkId(Integer workId);
}