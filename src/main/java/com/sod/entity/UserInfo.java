package com.sod.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class UserInfo {

    // One to One mapping with Users

    public UserInfo(String address, String gender, String phonenumber) {
        this.address = address;
        this.gender = gender;
        this.phonenumber = phonenumber;
    }

    public UserInfo() {
    }

    @Id
    @Column(name = "user_info_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_info_address")
    private String address;

    @Column(name = "user_info_gender")
    private String gender;

    @Column(name = "user_info_phonenumber")
    private String phonenumber;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    @OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "user_id")
    private User user;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /*--------------------------------------------------OVERRIDE---------------------------------------------------*/

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

}
