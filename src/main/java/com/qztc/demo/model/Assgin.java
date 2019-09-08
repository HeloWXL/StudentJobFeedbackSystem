package com.qztc.demo.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.util.Date;
@Data
public class Assgin {
    @TableId(value = "assgin_id",type = IdType.AUTO)
    private Integer assginId;

    private Integer workId;

    private Integer studentId;

    private String assginUrl;

    private Date createTime;
}