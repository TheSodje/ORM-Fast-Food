package com.sod.dto;
import java.util.List;

public class UserDTO {
    private String name;
    private List<String> roles;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}