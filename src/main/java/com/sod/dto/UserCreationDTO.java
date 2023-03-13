package com.sod.dto;
import java.util.List;

public class UserCreationDTO {
    
    private String name;
    private String password;
    private List<String> roles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}