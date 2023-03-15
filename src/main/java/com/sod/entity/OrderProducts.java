package com.sod.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class OrderProducts {

    @Id
    @Column(name = "order_products_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "order_products_quantity")
    private int quantity;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    @ManyToMany(targetEntity = Product.class, cascade = { CascadeType.ALL })
    @JoinTable(name = "order_products", joinColumns = { @JoinColumn(name = "order_id") }, inverseJoinColumns = {
            @JoinColumn(name = "product_id") })
    private Set<Product> product;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
