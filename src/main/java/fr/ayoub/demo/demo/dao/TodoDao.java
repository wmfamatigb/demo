package fr.ayoub.demo.demo.dao;

import fr.ayoub.demo.demo.model.Todo;

import java.util.List;

public interface TodoDao {
    public List<Todo> getTodos(Long userId);
    public Long addTodo(Todo todo);
}
