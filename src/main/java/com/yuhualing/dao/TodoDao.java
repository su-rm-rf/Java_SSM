package com.yuhualing.dao;

import com.yuhualing.entity.Todo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2023/4/8 0008.
 */
@Repository
public interface TodoDao {
    List<Todo> list(String completed);
    Todo detail(Integer id);
    int add(Todo todo);
    int update(Todo todo);
    int delete(Integer id);
    int clear();
}
