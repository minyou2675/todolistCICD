package sj.todolistCICD.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import src.main.java.sj.todolistCICD.domain.Todo;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {
    private List<Todo> todoList = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("todoList", todoList);
        return "index";
    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute Todo todo) {
        todoList.add(todo);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoList.removeIf(todo -> todo.getId().equals(id));
        return "redirect:/";
    }
}

