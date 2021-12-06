package com.example.demo.REST;

public class Character {
    private final long id;
    private final String characterName;
    private int str;
    private int dex;    
    private int con;    
    private int intel;    
    private int wis;    
    private int cha;

    public Character( long id, String characterName, int str, int dex, int con, int intel, int wis, int cha){
        this.id = id;
        this.characterName = characterName;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.intel = intel;
        this.wis = wis;
        this.cha = cha;
    }
}
