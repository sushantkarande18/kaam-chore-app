package com.sukar.appl.controller;

import com.sukar.appl.entity.UserEntity;
import com.sukar.appl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/list")
    public List<UserEntity> getAllUsers() {
        return userService.listAllUsers();
    }

    @GetMapping(path = "/{id}")
    public UserEntity getUserBYId(@PathVariable("id") Integer usersId) {
        return userService.getUserById(usersId);
    }

    @PostMapping(path = "/add")
    public void getUserBYId(@RequestBody UserEntity user) {
        userService.addNewUser(user);
    }

    @PutMapping(path = "/update")
    public void updateUser(@RequestBody UserEntity user) {
        userService.updateUser(user);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteUser(@PathVariable("id") Integer userId) {
        userService.deleteUser(userId);
    }

}
