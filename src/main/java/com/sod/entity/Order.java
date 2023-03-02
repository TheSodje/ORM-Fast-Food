package com.sod.entity;
import java.util.List;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Order {

    // Many to Many mapping with users(employee)
    // Many to Many mapping with product

    @Id
    @GeneratedValue
    private Long id;
    private String order_code;
    private int quantity;
    private String status;
    private LocalDate date;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "product_order",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id")
    )
    private List<Product> product;

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
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
