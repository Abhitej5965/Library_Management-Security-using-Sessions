package com.wavemaker.controller;

import com.wavemaker.model.User;
import com.wavemaker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public String userRegister(@RequestBody User user) {
        return userService.userRegister(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/{userId}/books/{bookId}")
    public String addBooksToUser(@PathVariable(value = "bookId") int bookId, @PathVariable(value = "userId") int userId) {
        return userService.addBooksToUsers(bookId, userId);
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable(value = "userId") int userId) {
        return userService.getUserById(userId);
    }

}

