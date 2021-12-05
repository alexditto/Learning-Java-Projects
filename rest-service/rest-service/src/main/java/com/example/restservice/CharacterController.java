package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {
    private static final long id = 200;
    User existingUser = new User(1, "Fonix", "password", "email");
    private final long userId = existingUser.getId();
    private static final String characterName = "Magic Wizard";

    @GetMapping("/character")
    public Character currentCharacter(){
        Character response = new Character(id, userId, characterName);
        return response;
    }

    @PostMapping("/character")
    public Character newCharacter(@RequestBody Character character){
        return character;
    }

    @DeleteMapping("/character")
    public Character deleteCharacter(@RequestBody Character character){
        return character;
    }
    

}
