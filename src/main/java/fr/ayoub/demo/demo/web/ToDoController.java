package fr.ayoub.demo.demo.web;


import fr.ayoub.demo.demo.model.AddTodoRequest;
import fr.ayoub.demo.demo.model.Todo;
import fr.ayoub.demo.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
public class ToDoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public String getTodos( @RequestParam Long userId, Model model) {
        List<Todo> todos = todoService.getTodos(userId);
        model.addAttribute("userId", userId);
        model.addAttribute("todos", todoService.getTodos(userId));
        return "todos";
    }
}


@RestController
class TodoRestController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/todos")
    public Long addTodo(@RequestBody AddTodoRequest request){
        return this.todoService.addTodo(request);
    }
}
