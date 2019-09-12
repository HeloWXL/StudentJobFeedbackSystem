package com.qztc.demo.mapper;

import com.qztc.demo.model.Discuss;
import com.qztc.demo.vo.DiscussCommentVo;
import com.qztc.demo.vo.StudentCourseVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DiscussMapper {
    int deleteByPrimaryKey(Integer discussId);

    int insert(Discuss record);

    int insertSelective(Discuss record);

    Discuss selectByPrimaryKey(Integer discussId);

    int updateByPrimaryKeySelective(Discuss record);

    int updateByPrimaryKey(Discuss record);

    /**
     * 根据学生ID 查询讨论的内容
     * @param sid
     * @return
     */
    @Select("SELECT d.discuss_id,d.student_id as disStudentId,d.discuss_content,d.create_time as disCreateTime,\n" +
            "c.comment_id,c.student_id as comStudentId,c.comment_content,c.create_time as comCreateTime\n" +
            "FROM discuss d ,comments c \n" +
            "where d.discuss_id=c.discuss_id and d.student_id=#{sid}")
    List<DiscussCommentVo> selectDiscussByStudentId(Integer sid);

    @Select("select COUNT(1)\n" +
            "FROM discuss d ,comments c \n" +
            "where d.discuss_id=c.discuss_id and d.student_id=#{sid}")
    int countDiscussByStudent(Integer sid);
}