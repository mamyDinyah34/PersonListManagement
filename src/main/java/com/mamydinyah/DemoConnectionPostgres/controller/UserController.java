package com.mamydinyah.DemoConnectionPostgres.controller;

import com.mamydinyah.DemoConnectionPostgres.dto.UserDto;
import com.mamydinyah.DemoConnectionPostgres.entity.User;
import com.mamydinyah.DemoConnectionPostgres.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String allUsers(Model model) {
        List<User> users = userService.allUsers();
        model.addAttribute("users", users);
        model.addAttribute("newUser", new UserDto());
        return "page";
    }

    @PostMapping("/create")
    public String saveUser(@ModelAttribute UserDto userDto) {
        userService.saveUser(userDto);
        return "redirect:/";
    }

    @GetMapping("/users/edit/{id}")
    public String editUser(@PathVariable int id, Model model) {
        User user = userService.userById(id);
        if (user != null) {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setName(user.getName());
            userDto.setEmail(user.getEmail());
            model.addAttribute("userDto", userDto);
            return "redirect:/";
        }
        return "redirect:/";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute UserDto userDto) {
        userService.updateUser(userDto);
        return "redirect:/";
    }


    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}