package com.sod.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Product {

    // Many to Many mapping with User
    // Many to Many mapping with Order

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_type")
    private String type;

    @Column(name = "product_price")
    private Double price;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    // @ManyToMany(mappedBy = "products")
    // private List<Orders> orders;

    @OneToMany(
        mappedBy = "product",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<OrderProduct> orders;

    /*--------------------------------------------------GETTERS & SETTERS---------------------------------------------------*/

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", orders=" + orders +
                '}';
    }

}