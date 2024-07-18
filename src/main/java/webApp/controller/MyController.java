package webApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import webApp.model.User;
import webApp.service.UserService;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.listUsers());
        return "users";
    }

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
        User user = new User(firstName, lastName, age);
        userService.add(user);
        return "redirect:/users";
    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam long id) {
        User user = userService.findById(id);
        if (user != null) {
            userService.delete(user);
        }
        return "redirect:/users";
    }

    @PostMapping("/update")
    public String updateUser(@RequestParam long id, @RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
        User user = userService.findById(id);
        if (user != null) {
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setAge(age);
            userService.update(user);
        }
        return "redirect:/users";
    }


}

