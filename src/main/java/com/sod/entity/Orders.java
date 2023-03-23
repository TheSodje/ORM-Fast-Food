package com.sod.entity;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import java.util.*;

import org.hibernate.annotations.NaturalIdCache;

@Entity
@NaturalIdCache
public class Orders {

    // Many to Many mapping with User
    // Many to Many mapping with Order
    public Orders() {
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_code")
    private String code;

    @Column(name = "order_status")
    private String status;

    @Column(name = "order_date")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime date;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    // @ManyToMany
    // @JoinTable(name = "order_product",
    // joinColumns = @JoinColumn(name = "order_id"),
    // inverseJoinColumns = @JoinColumn(name = "product_id"))
    // private List<Product> products;
    
    @OneToMany(
        mappedBy = "orders",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<OrderProduct> products;

    /*--------------------------------------------------GETTERS & SETTERS---------------------------------------------------*/

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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
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
