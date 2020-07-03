package com.swagger.controller;

import com.swagger.models.UserModel;
import com.swagger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<UserModel> getAllUser(){
        return userRepository.findAll();
    }

    @GetMapping("/{email}")
    public UserModel getUserByEmail(@PathVariable String email){
        return userRepository.findByEmail(email);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserModel user){
        userRepository.save(user);
        return "Record Updated";
    }
    @DeleteMapping("/delete/all")
    public String deleteAllUser(){
        userRepository.deleteAll();
        return "Deleted ALL Records";
    }
    @DeleteMapping("/delete/{email}")
    public String deleteByEmail(@PathVariable String email){
        userRepository.deleteByEmail(email);
        return "Deleted User by "+email;
    }

}
