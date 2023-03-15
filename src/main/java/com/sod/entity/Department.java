package com.sod.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Department {

    // One to Many mapping with users(employee)
    // One to Many mapping with Roles

    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "department_name")
    private String name;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    @OneToMany(mappedBy = "department")
    private List<User> users;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
