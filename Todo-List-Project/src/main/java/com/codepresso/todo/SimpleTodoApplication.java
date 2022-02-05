package com.codepresso.todo;

import com.codepresso.todo.vo.Todo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SimpleTodoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleTodoApplication.class, args);
    }

    //todoList를 위한
    @Bean
    public List<Todo> todoList() {
        return new ArrayList<>();
    }
}
