package com.example.demo.REST;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    private static final long id = 1;
    private static final String username = "Fonix";
    private static final String password = "Total Security";
    private static final String email = "my@email.com";

    @GetMapping("/user")
    public User existingUser(){
        User response = new User(id, username, password, email);
        return response;
    }

    @PostMapping("/user")
    public User createExistingUser(@RequestBody User user){
        return user;
    }

    @GetMapping("/user/id")
    public long existingUserId(){
        User response = new User(id, username, password, email);
        return response.getId();
    }

    @GetMapping("/user/username")
    public String existingUserUsername(){
        User response = new User(id, username, password, email);
        return response.getUsername();
    }

    @DeleteMapping("/user")
    public User deleteAllUsers(@RequestBody User user){
        return user;
    }

    @DeleteMapping("/user/username")
    public User deleteUser(@RequestBody User user){
        return user;
    }

}

