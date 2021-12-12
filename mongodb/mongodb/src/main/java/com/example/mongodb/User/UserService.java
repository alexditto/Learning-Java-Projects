package com.example.mongodb.User;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public List<User> getUsers(){
        return List.of(
            new User(
                    (long) 1,
                    "Fonix",
                    "email@email.com",
                    LocalDate.now()
                ));
    }
}
