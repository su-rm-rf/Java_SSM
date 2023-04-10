package com.yuhualing.controller;

import com.yuhualing.dao.TodoDao;
import com.yuhualing.dto.TodoDTO;
import com.yuhualing.entity.Todo;
import com.yuhualing.service.TodoService;
import com.yuhualing.util.ResponseClient;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2023/4/8 0008.
 */
@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("/list")
    @ResponseBody
    public ResponseClient list(String completed) {
        List<Todo> list = todoService.list(completed);
        ResponseClient rc = new ResponseClient();
        rc.setCode("success");
        rc.setData(list);
        rc.setMsg("获取列表成功");
        return rc;
    }

    @RequestMapping(value = "/{id}")
    @ResponseBody
    public ResponseClient detail(@PathVariable Integer id) {
        Todo todo = todoService.detail(id);
        ResponseClient rc = new ResponseClient();
        rc.setCode("success");
        rc.setData(todo);
        rc.setMsg("获取详情成功");
        return rc;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseClient add(@RequestBody TodoDTO todoDTO) {
        Todo todo = new Todo();
        todo.setText(todoDTO.getText());
        todo.setCompleted(todoDTO.getCompleted());

        int rows = todoService.add(todo);
        ResponseClient rc = new ResponseClient();
        if (rows > 0) {
            rc.setCode("success");
            rc.setMsg("添加成功");
        } else {
            rc.setCode("fail");
            rc.setMsg("添加失败");
        }
        rc.setData(null);
        return rc;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseClient update(@RequestBody Todo todo) {
        int rows = todoService.update(todo);
        ResponseClient rc = new ResponseClient();
        rc.setCode("success");
        rc.setData(todo);
        rc.setMsg("更新成功");
        return rc;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public ResponseClient delete(@RequestBody Todo todo) {
        int rows = todoService.delete(todo.getId());
        ResponseClient rc = new ResponseClient();
        rc.setCode("success");
        rc.setData(null);
        rc.setMsg("删除成功");
        return rc;
    }

    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    @ResponseBody
    public ResponseClient clear() {
        int rows = todoService.clear();
        ResponseClient rc = new ResponseClient();
        rc.setCode("success");
        rc.setData(null);
        rc.setMsg("删除成功");
        return rc;
    }
}
