package com.yuhualing.controller;

import com.yuhualing.entity.Todo;
import com.yuhualing.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @RequestMapping(value = "/addTodo.do", method = RequestMethod.GET)
    public String addTo(Todo todo) {
        return "todo/addTodo";
    }

    @RequestMapping(value = "/addTodo.do", method = RequestMethod.POST)
    public ModelAndView addTodo(Todo todo) {
        ModelAndView mv = new ModelAndView();

        todo.setCompleted(0);
        int rows = todoService.addTodo(todo);
        String msg = "";
        if (rows > 0) {
            msg = "添加成功";
            mv.addObject("msg", todo.toString());
            mv.setViewName("redirect:/todo/queryTodo.do");
        } else {
            msg = "添加失败";
            mv.addObject("msg", msg);
        }
        return mv;
    }

    @RequestMapping(value = "/queryTodo.do")
    public String queryTodo() {
        return "todo/queryTodo";
    }

    @RequestMapping(value = "/queryTodoList.do")
    @ResponseBody
    public List<Todo> queryTodoList() {
        List<Todo> list = todoService.queryTodo();
        return list;
    }
}
