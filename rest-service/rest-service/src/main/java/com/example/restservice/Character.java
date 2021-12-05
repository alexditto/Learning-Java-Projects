package com.example.restservice;

public class Character {
    private final long id;
    private final long userId;
    private final String characterName;

    public Character(long id, long userId, String characterName){
        this.id = id;
        this.userId = id;
        this.characterName = characterName;
        }

    public long getId(){
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public String getCharacterName() {
        return characterName;
    }
}
