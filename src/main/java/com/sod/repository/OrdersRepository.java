package com.sod.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.sod.entity.Orders;
import com.sod.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class OrdersRepository {

    private final EntityManager entityManager;

    public OrdersRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Orders> getOrder() {
        String query = "select g from Orders g";
        TypedQuery<Orders> typedQuery = entityManager.createQuery(query, Orders.class);
        return typedQuery.getResultList();
    }

    private Orders createOrder(Orders product) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(product);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return product;
    }

    public Orders createOrder(String orderCode, String status, List<Product> product, LocalDateTime date) {
        Orders orders = new Orders();
        orders.setCode(orderCode);
        orders.setStatus(status);
        orders.setDate(date);
        return createOrder(orders);
    }

}
