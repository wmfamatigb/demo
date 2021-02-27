package fr.ayoub.demo.demo.service.impl;

import fr.ayoub.demo.demo.dao.TodoDao;
import fr.ayoub.demo.demo.model.AddTodoRequest;
import fr.ayoub.demo.demo.model.Todo;
import fr.ayoub.demo.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoDao todoDao;

    @Override
    public List<Todo> getTodos(Long userId) {
        return todoDao.getTodos(userId);
    }

    @Override
    public Long addTodo(AddTodoRequest todoReq) {
        Todo todo = new Todo();
        todo.setUserId(todoReq.getUserId());
        todo.setContent(todoReq.getContent());
        todo.setTitle(todoReq.getTitle());
        return this.todoDao.addTodo(todo);
    }
}
