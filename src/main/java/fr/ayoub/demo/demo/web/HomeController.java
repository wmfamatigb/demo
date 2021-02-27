package fr.ayoub.demo.demo.web;

import fr.ayoub.demo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String getHomePage(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "home";
    }
}
