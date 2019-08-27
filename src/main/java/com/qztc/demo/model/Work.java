package com.qztc.demo.model;

import lombok.Data;

/**
 * 作业表
 * @author wangxl
 * @since
 */
@Data
public class Work {
    private Integer workId;

    private String workName;

    private Integer courseId;

    private Integer studentId;

    private String wordUrl;

    private Integer teacherId;
}