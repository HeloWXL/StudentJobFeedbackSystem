package com.qztc.demo.vo;

import lombok.Data;

import java.util.List;

public class StudentCourseListVo {
    private List<StudentCourseVo> courseList;//该学生的课程列表
    private Integer count;//该学生的课程数量；

    //Alt+Insert 快捷键  创建get set方法
    public List<StudentCourseVo> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<StudentCourseVo> courseList) {
        this.courseList = courseList;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
