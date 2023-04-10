package com.yuhualing.service;

import com.yuhualing.entity.Todo;

import java.util.List;

/**
 * Created by Administrator on 2023/4/8 0008.
 */
public interface TodoService {
    int addTodo(Todo todo);
    List<Todo> queryTodo();
}
