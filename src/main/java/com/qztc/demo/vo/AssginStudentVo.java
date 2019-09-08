package com.qztc.demo.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;

import java.util.Date;

@Data
public class AssginStudentVo {

    private String studentSno;

    private String studentName;

    private Integer assginId;

    private Date createTime;
}
