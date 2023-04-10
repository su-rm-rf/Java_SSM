package com.yuhualing.dto;

/**
 * Created by Administrator on 2023/4/11 0011.
 */
public class TodoDTO {
    private String text;
    private Integer completed;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public Integer getCompleted() {
        return completed;
    }
    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return this.getText() + ", " + this.getCompleted();
    }
}
