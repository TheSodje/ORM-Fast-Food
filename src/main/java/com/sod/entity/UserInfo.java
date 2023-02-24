package com.sod.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

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
    @GeneratedValue
    private Long id;
    private String address;
    private String gender;
    private String phonenumber;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    /*--------------------------------------------------OVERRIDE---------------------------------------------------*/

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }

}
