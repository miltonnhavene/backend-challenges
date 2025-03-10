package com.backend.todolist.controller;

import com.backend.todolist.entity.UserEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/")
    public void create(@RequestBody UserEntity userEntity ){
        System.out.println(userEntity.getName());
    }
}
