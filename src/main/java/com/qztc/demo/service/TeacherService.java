package com.qztc.demo.service;

import com.qztc.demo.model.Student;
import com.qztc.demo.model.Teacher;

public interface TeacherService {
  public Teacher selectByTno(String sno);

  public int insertSelective(Teacher teacher);
}
