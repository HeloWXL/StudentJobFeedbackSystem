package com.qztc.demo.service.Impl;

import com.qztc.demo.mapper.StudentMapper;
import com.qztc.demo.model.Student;
import com.qztc.demo.service.StudentService;
import com.qztc.demo.utils.Md5Utils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

  /**
   * 导入学生名单
   * @param list
   */
  @Override
  public void importStudentList(List<List<String>> list){
    for ( int i = 0 ; i <list.size();i++){
      Student student = new Student();

      String sno = list.get(i).get(0);
      System.out.println(sno);
      int snolength = sno.length();

      //学号
      if(sno.substring(snolength-2,snolength).equals(".0")){
        student.setStudentSno(sno.substring(0,snolength-2));
      }else{
        student.setStudentSno(sno);
      }
      // 姓名
      student.setStudentName(list.get(i).get(1));

      //设置默认值
      student.setStudentPassword(Md5Utils.getSaltMD5("123456"));
      student.setClassId(5);
      student.setStudentProfession("信息管理与信息系统");
//      student.setStudentProfession("计算机科学与技术");
      student.setStudentApartment("数学与计算机科学学院");

      studentMapper.insertSelective(student);
    }
  }
}
