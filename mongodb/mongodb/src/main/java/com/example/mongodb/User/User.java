package com.example.mongodb.User;

import java.time.LocalDate;

public class User {
    private Long id;
    private String username;
    private String email;
    private LocalDate createdDate;

    public User() {
    
    }
    public User(Long id, String username, String email, LocalDate createdDate){
        this.id = id;
        this.username = username;
        this.email = email;
        this.createdDate = createdDate;
    }
    public User(String username, String email, LocalDate createdDate){
        this.username = username;
        this.email = email;
        this.createdDate = createdDate;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public LocalDate getCreatedDate(){
        return createdDate;
    }
    public void setCreatedDate(LocalDate createdDate){
        this.createdDate = createdDate;
    }

}
