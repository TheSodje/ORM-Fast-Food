package com.sod.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Role {

    // Many to One mapping with Department
    // Many to Many mapping with users

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "role_name")
    private String name;

    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "department_id")
    private Department department;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

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
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
