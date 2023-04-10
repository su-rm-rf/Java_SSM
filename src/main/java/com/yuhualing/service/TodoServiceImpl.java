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
    public List<Todo> list(String completed) {
        List<Todo> list = todoDao.list(completed);
        return list;
    }

    @Override
    public Todo detail(Integer id) {
        return todoDao.detail(id);
    }

    @Override
    public int add(Todo todo) {
        int rows = todoDao.add(todo);
        return rows;
    }

    @Override
    public int update(Todo todo) {
        int rows = todoDao.update(todo);
        return rows;
    }

    @Override
    public int delete(Integer id) {
        int rows = todoDao.delete(id);
        return rows;
    }

    @Override
    public int clear() {
        int rows = todoDao.clear();
        return rows;
    }
}
