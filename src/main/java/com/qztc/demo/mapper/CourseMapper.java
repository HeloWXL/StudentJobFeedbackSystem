package com.qztc.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qztc.demo.model.Course;
import com.qztc.demo.vo.TeacherCourseVo;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {
    int deleteByPrimaryKey(Integer couserId);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer couserId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    /**
     * 根据教师的ID查询课程信息
     * @param tid
     * @return
     */
    @Select("SELECT c.course_name , c.course_picture ,t.teacher_name,t.teacher_job_title,t.teacher_profession\n" +
        "FROM course c ,teacher t\n" +
        "WHERE  t.teacher_id = #{tid} and c.teacher_id = t.teacher_id")
    List<TeacherCourseVo> selectCourseByTid(Integer tid);


    /**
     * 根据教师的ID统计教师的课程数量
     * @return
     */
    @Select("SELECT count(1)\n" +
        "FROM course c ,teacher t\n" +
        "WHERE  t.teacher_id = #{tid} and c.teacher_id = t.teacher_id")
    int CountCourseForStu(Integer tid);
}