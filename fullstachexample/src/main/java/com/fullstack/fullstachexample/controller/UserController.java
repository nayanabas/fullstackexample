package com.fullstack.fullstachexample.controller;

import com.fullstack.fullstachexample.model.User;
import com.fullstack.fullstachexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("auto/")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    List<User> getAllUsers(){
       return userService.getAllUsers();
    }

    @PostMapping("add")
    User saveUsers(@RequestBody User user){
        return userService.save(user);
    }


}
