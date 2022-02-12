package com.fullstack.fullstachexample.service;

import com.fullstack.fullstachexample.model.User;
import com.fullstack.fullstachexample.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers() {

        return userRepo.findAll();
    }

    public User save(User user) {

        return userRepo.save(user);
    }
}
