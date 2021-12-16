package com.example.mongodb.Character;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/characters")
public class CharacterController {
    private final CharacterService characterService;
    
    @Autowired
    public CharacterController(CharacterService characterService){
        this.characterService = characterService;
    }

    @GetMapping()
    public List<Character> getCharacters(){
        return characterService.getCharacters();
    }
}
