package com.sod.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.Objects;
import java.util.List;

@Entity
public class User {

    // Many to One mapping with Department
    // Many to Many mapping with Roles
    // Many to Many mapping with Product
    // Many to Many mapping with Order
    // One to One mapping with userinfo

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String first_name;
    private String last_name;
    private String username;
    private String password;


    public User(String name, String password, List<Role> roles) {
        this.first_name = Objects.requireNonNull(getFirst_name());
        this.last_name = Objects.requireNonNull(getLast_name());
        this.username = Objects.requireNonNull(getUsername());
        this.password = this.encrypt(getPassword());
        this.roles = Objects.requireNonNull(roles);
    }

    
    @OneToMany(mappedBy = "role" )
    private List<Role> roles;
    
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "department_id")
    private Department department;

    public User() {

    }

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    String encrypt(String password) {
        return this.password = password;
    }

    /*--------------------------------------------------OVERRIDE---------------------------------------------------*/

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname = '" + first_name + '\'' +
                ", lastname = '" + last_name + '\'' +
                ", username = " + username +
                ", password = " + password +
                '}';
    }
}