package com.codepresso.todo.service;

import java.util.List;

import com.codepresso.todo.repository.TodoRepository;
import com.codepresso.todo.vo.Todo;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void addTodo(Todo todo) {
        todo.setIsCompleted("N");
        todoRepository.save(todo);
    }

    public List<Todo> getTodoList(){
        return todoRepository.findAll();
    }

    public void deleteTodo(int index) {
        todoRepository.deleteById(index);
    }
}
