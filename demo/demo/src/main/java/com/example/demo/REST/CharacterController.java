package com.example.demo.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {
    private static final long id = 1;
    private static final String characterName = "New Character";
    private int str = 10;
    private int dex = 10;
    private int con = 10;
    private int intel = 10;
    private int wis = 10;
    private int cha = 10;
    
    @GetMapping("/character")
    public Character currentCharacter(){
        Character response = new Character(id,  characterName,  str,  dex,  con,  intel,  wis,  cha);
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