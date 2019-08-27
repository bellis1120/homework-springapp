package com.rakuten.internship;

import java.util.List;

import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * このクラスは、ウェブアプリケーションの挙動を制御するためのコントローラークラスです。。
 * コントローラーとして使えるように、コードを記入してください。
 */
@Controller
public class TodoController {
    
    @Autowired
    TodoService todoservice;

    // TODO 必要なメンバーを宣言してください。
    
    @GetMapping("/") 
    public String home(Model model) {
        // TODO 必要なコードを作成してください。
        List<Todo> todos = todoservice.findTodos();
        model.addAttribute("todos",todos);
        return "home";
    }

    @GetMapping("/create")
    public String create() {
        // TODO 必要なコードを作成してください。
        return null;
    }

    @PostMapping("/create")
    public String createTodo(@ModelAttribute Todo todo) {
        // TODO 必要なコードを作成してください。
        return null;
    }
}
