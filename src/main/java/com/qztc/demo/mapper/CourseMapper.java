package com.qztc.demo.mapper;

import com.qztc.demo.model.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer couserId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer couserId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}