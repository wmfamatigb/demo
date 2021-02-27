package fr.ayoub.demo.demo.service;

import fr.ayoub.demo.demo.model.AddTodoRequest;
import fr.ayoub.demo.demo.model.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getTodos(Long userId);
    public Long  addTodo(AddTodoRequest todoRequest);
}
