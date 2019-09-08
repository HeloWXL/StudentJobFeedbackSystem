package com.qztc.demo.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;

@Data
public class WorkCourseVo {

    private Integer workId;

    private String workName;

    private String courseName;

    private String coursePicture;
}
