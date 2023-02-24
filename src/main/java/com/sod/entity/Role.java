package com.sod.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Role {

    // Many to One mapping with Department
    // Many to Many mapping with users

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String info;

    @ManyToOne
    private Department department;

    // @ManyToMany
    // private

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info=" + info +
                '}';
    }
}
