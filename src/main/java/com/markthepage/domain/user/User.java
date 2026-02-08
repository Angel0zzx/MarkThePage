package com.markthepage.domain.user;

import java.util.UUID;

public class User {

    UUID id;
    String username;
    String email;
    String password;

    public User(String username, String email, String password) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void changeUsername(String newUsername) {
        this.username = newUsername;
    }
    
    public String getEmail() { return email; }
    public String getUsername() { return username; }
}
