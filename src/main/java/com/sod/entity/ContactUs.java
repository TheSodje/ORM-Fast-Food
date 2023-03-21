package com.sod.entity;

import jakarta.persistence.*;

@Entity
public class ContactUs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "client_name")
    private String name;

    @Column(name = "client_mail")
    private String email;

    @Column(name = "client_number")
    private String number;

    @Column(name = "client_message", length = 65535, columnDefinition="TEXT")
    private String message;

    /*--------------------------------------------------GETTERS & SETTERS---------------------------------------------------*/

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /*--------------------------------------------------OVERRIDE---------------------------------------------------*/

    @Override
    public String toString() {
        return "ContactUs{" +
                "id=" + id +
                ", name = '" + name + '\'' +
                ", email = '" + email + '\'' +
                ", number = " + number +
                ", message = " + message +
                '}';
    }
}
