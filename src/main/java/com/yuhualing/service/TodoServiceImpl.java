package com.yuhualing.service;

import com.yuhualing.dao.TodoDao;
import com.yuhualing.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2023/4/8 0008.
 */
@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoDao todoDao;

    @Override
    public int addTodo(Todo todo) {
        int rows = todoDao.insertTodo(todo);
        return rows;
    }

    @Override
    public List<Todo> queryTodo() {
        List<Todo> list = todoDao.queryTodo();
        return list;
    }
}
