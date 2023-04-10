package com.yuhualing.entity;

/**
 * Created by Administrator on 2023/4/8 0008.
 */
public class Todo {

    private Integer id;
    private String text;
    private Integer completed;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

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
        return text.toString() + ", " + completed.toString();
    }
}
