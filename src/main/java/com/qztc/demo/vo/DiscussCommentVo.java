package com.qztc.demo.vo;

import lombok.Data;

import java.util.Date;

@Data
public class DiscussCommentVo {
    private Integer discussId;

    private Integer disStudentId;

    private String discussContent;

    private Date disCreateTime;

    private Integer commentId;

    private Integer comStudentId;

    private String commentContent;

    private Date comCreateTime;
}
