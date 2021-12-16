package com.example.mongodb.Character;

import java.util.List;

import com.example.mongodb.User.User;

import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    public List<Character> getCharacters(){
        return List.of(
            new Character(
                99999,
                1,
                "The thief",
                "thief")
        );
    }
}
