package com.restaurant.backend.controller;

import com.restaurant.backend.model.User;
import com.restaurant.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public void addUser(@RequestBody User newUser){
        userService.addUser(newUser);
    }

    @GetMapping("/getusers")
    public void getUsers()  {
        userService.allUsers();
    }


}
