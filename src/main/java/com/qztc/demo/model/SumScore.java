package com.qztc.demo.model;

public class SumScore {
    private Integer sumScoreId;

    private Integer scoreId;

    private String sumScore;

    public Integer getSumScoreId() {
        return sumScoreId;
    }

    public void setSumScoreId(Integer sumScoreId) {
        this.sumScoreId = sumScoreId;
    }

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public String getSumScore() {
        return sumScore;
    }

    public void setSumScore(String sumScore) {
        this.sumScore = sumScore == null ? null : sumScore.trim();
    }
}