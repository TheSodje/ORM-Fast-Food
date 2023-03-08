package com.sod.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class User {

    // Many to One mapping with Department
    // Many to Many mapping with Roles
    // Many to Many mapping with Product
    // Many to Many mapping with Order
    // One to One mapping with userinfo

    @Id
    @GeneratedValue
    private Long id;
    private String first_name;
    private String last_name;
    private String username;

    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "department_id")
    private Department department;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    /*--------------------------------------------------OVERRIDE---------------------------------------------------*/

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname = '" + first_name + '\'' +
                ", lastname = '" + last_name + '\'' +
                ", username = " + username +
                '}';
    }
}
