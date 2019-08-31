package com.qztc.demo.service.Impl;

import com.qztc.demo.mapper.StudentMapper;
import com.qztc.demo.mapper.TeacherMapper;
import com.qztc.demo.model.Student;
import com.qztc.demo.model.Teacher;
import com.qztc.demo.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangxl
 * @ClassName TeacherServiceImpl
 * @Description TODO
 * @date 2019/8/31 17:42
 * @Version 1.0
 */
@Service
public class TeacherServiceImpl implements TeacherService {
  @Resource
  private TeacherMapper teacherMapper;

  @Override
  public Teacher selectByTno(String tno) {
    return teacherMapper.selectByTno(tno);
  }

  @Override
  public int insertSelective(Teacher student) {
    return teacherMapper.insertSelective(student);
  }
}
