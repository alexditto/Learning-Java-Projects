package com.example.mongodb.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/users")
public class UserController {
    private final UserService userService;
    public UserRepository userRepository;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    public UserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping()
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/all")
    public List<User> getAllStudents() {
        return UserRepository.findAll()
    }

    @PostMapping()
    public void saveUser(@RequestBody User user){
        // return userService.save(user);
        System.out.println(userService);
        userService.save(user);
    }
}
