package com.qztc.demo.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

/**
 * 单次作业排名
 * @author wangxl
 * @since
 */
@Data
@TableName(value = "rank")
public class Rank {
    @TableId(value = "rank_id",type = IdType.AUTO)
    private Integer rankId;

    @TableField("score_id")
    private Integer socreId;

    @TableField("rank_score")
    private Integer rankScore;
}