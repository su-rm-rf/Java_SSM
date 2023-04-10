package com.yuhualing.dao;

import com.yuhualing.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2023/4/8 0008.
 */
@Repository
public interface TodoDao {
    int insertTodo(Todo todo);
    List<Todo> queryTodo();
}
