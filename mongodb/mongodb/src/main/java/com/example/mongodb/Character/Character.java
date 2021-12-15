package com.example.mongodb.Character;

import org.springframework.data.annotation.Id;

public class Character {
    @Id
    private int id;
    private int userId;
    private String name;
    private String type;

    public Character(){

    }
    public Character(int id, int userId, String name, String type){
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.type = type;
    }
    public Character(int userId, String name, String type){
        this.userId = userId;
        this.name = name;
        this.type = type;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getUserId(){
        return userId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

}