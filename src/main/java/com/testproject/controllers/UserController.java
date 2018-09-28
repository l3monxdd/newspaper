package com.testproject.controllers;

import com.testproject.entities.Color;
import com.testproject.entities.User;
import com.testproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.delete(id);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.findById(id);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/findByAge/{age}")
    public List<User> findByAge(@PathVariable int age) {
        return userService.findByAge(age);
    }

    @GetMapping("/findUserByColorInArticle/{color}")
    public List<User> findUserByColorInArticle(@PathVariable Color color) {
        return userService.findUserByColorInArticle(color);
    }


}
