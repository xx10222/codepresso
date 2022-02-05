package com.codepresso.todo.controller;

import java.util.List;

import com.codepresso.todo.service.TodoService;
import com.codepresso.todo.vo.ResultDto;
import com.codepresso.todo.vo.Todo;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

    public TodoService todoService;

    // 의존성 주입
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = "/todo")
    public List<Todo> getTodoList(){
        List<Todo> list = todoService.getTodoList();
        return list;
    }


    @PostMapping(value = "/todo")
    public ResultDto addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
        return new ResultDto(200, "Success");
    }


    @DeleteMapping(value = "/todo/{id}")
    public ResultDto deleteTodo(@PathVariable("id") Integer id) {
        todoService.deleteTodo(id);
        return new ResultDto(200, "Success");
    }

}
