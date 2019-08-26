package com.qztc.demo.service.Impl;

import com.qztc.demo.mapper.StudentMapper;
import com.qztc.demo.model.Student;
import com.qztc.demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangxl
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @date 2019/8/27 0:13
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

  @Resource
  private StudentMapper studentMapper;

  @Override
  public List<Student> selectAll() {
    return studentMapper.selectAll();
  }
}
