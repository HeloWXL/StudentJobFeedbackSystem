package com.qztc.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qztc.demo.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper  extends BaseMapper<Student> {
    int deleteByPrimaryKey(Integer studentId);

    int insertSelective(Student student);

    Student selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);


    /**
     * 根据学号查询学生信息
     * @param sno
     * @return
     */
    @Select("select * from student where student_sno = #{sno}")
    Student selectBySno(String sno);
}