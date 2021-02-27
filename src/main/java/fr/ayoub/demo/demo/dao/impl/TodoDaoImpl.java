package fr.ayoub.demo.demo.dao.impl;

import fr.ayoub.demo.demo.Util.RandomUtils;
import fr.ayoub.demo.demo.dao.TodoDao;
import fr.ayoub.demo.demo.model.Todo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TodoDaoImpl implements TodoDao {

    private static List<Todo> inMemoryTodos = new ArrayList<>();

    @Override
    public List<Todo> getTodos( Long userId) {
        return inMemoryTodos;
    }

    @Override
    public Long addTodo(Todo todo) {
        Long id = RandomUtils.getRandomLong();
        todo.setId(id);
        this.inMemoryTodos.add(todo);
        return id;
    }
}
