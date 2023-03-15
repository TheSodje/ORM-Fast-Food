package com.sod.entity;

import java.time.LocalDate;
import jakarta.persistence.*;
import java.util.*;

@Entity
public class Order {

    // Many to Many mapping with User
    // Many to Many mapping with Order

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_code")
    private String code;

    @Column(name = "order_status")
    private String status;

    @Column(name = "order_date")
    private LocalDate date;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", order_code='" + code + '\'' +
                ", status=" + status +
                ", date=" + date +
                '}';
    }

}
