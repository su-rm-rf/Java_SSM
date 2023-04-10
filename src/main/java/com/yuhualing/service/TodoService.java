package com.yuhualing.service;

import com.yuhualing.entity.Todo;

import java.util.List;

/**
 * Created by Administrator on 2023/4/8 0008.
 */
public interface TodoService {
    List<Todo> list(String completed);
    Todo detail(Integer id);
    int add(Todo todo);
    int update(Todo todo);
    int delete(Integer id);
    int clear();
}
