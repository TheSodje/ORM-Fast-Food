package com.sod.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Order {

    // Many to Many mapping with users(employee)
    // Many to Many mapping with product

    @Id
    @GeneratedValue
    private Long id;
    private String order_code;
    private Long quantity;
    private String status;
    private LocalDate date;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    // @ManyToMany(mappedBy = "order")
    // private List<Product> product = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_code() {
        return order_code;
    }

    public void setOrder_code(String order_code) {
        this.order_code = order_code;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // MySQL DATETIME format: YYYY-MM-DD hh:mm:ss
    // LocalTime date = LocalTime.now();
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", order_code='" + order_code + '\'' +
                ", quantity=" + quantity +
                ", status=" + status +
                ", date=" + date +
                '}';
    }
}
