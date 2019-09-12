package com.qztc.demo.vo;

import java.util.List;

public class DiscussCommentListVo {
    private List<DiscussCommentVo> list;

    private Integer count;

    public List<DiscussCommentVo> getList() {
        return list;
    }

    public void setList(List<DiscussCommentVo> list) {
        this.list = list;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
