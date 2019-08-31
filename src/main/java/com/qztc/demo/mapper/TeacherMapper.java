package com.qztc.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qztc.demo.model.Teacher;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper extends BaseMapper<Teacher> {
    /**
     *
     * @param teacherId
     * @return
     */
    int deleteByPrimaryKey(Integer teacherId);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(Teacher record);

    /**
     *
     * @param teacherId
     * @return
     */
    Teacher selectByPrimaryKey(Integer teacherId);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Teacher record);

    /**
     * 根据学号查询学生信息
     * @param tno
     * @return
     */
    @Select("select * from teacher where teacher_tno = #{tno}")
    Teacher selectByTno(String tno);
}