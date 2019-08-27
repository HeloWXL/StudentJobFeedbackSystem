package com.qztc.demo.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

/**
 * 成绩表
 * @author wangxl
 * @since
 */
@Data
@TableName(value = "score")
public class Score {
    @TableId(value = "score_id",type = IdType.AUTO)
    private Integer scoreId;

    private Integer workId;

    private Integer courseId;

    private Integer score;

}