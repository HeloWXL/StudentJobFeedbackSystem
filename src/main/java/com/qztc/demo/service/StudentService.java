package com.qztc.demo.service;

import com.qztc.demo.model.Student;

import java.util.List;

/**
 * @author wangxl
 * @ClassName StudentService
 * @Description TODO
 * @date 2019/8/29 22:31
 * @Version 1.0
 */
public interface StudentService {


  Student selectBySno(String sno);


  int insertSelective(Student student);

  void importStudentList(List<List<String>> list);
}
