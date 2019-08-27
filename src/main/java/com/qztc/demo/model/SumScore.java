package com.qztc.demo.model;

import lombok.Data;

/**
 * 成绩汇总表
 * @author wangxl
 * @since
 */
@Data
public class SumScore {
    private Integer sumScoreId;

    private Integer scoreId;

    private String sumScore;
}