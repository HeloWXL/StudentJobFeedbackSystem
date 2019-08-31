package com.qztc.demo.service.Impl;

import com.qztc.demo.mapper.StudentMapper;
import com.qztc.demo.model.Student;
import com.qztc.demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangxl
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @date 2019/8/29 22:31
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

  @Resource
  private StudentMapper studentMapper;


  @Override
  public Student selectBySno(String sno) {
    return studentMapper.selectBySno(sno);
  }

  @Override
  public int insertSelective(Student student) {
    return studentMapper.insertSelective(student);
  }
}
