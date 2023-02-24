package com.sod.repository;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class OrderRepository {

    private EntityManager entityManager;

    public OrderRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Order> getOrder() {
        String query = "select g from Order g";
        TypedQuery<Order> typedQuery = entityManager.createQuery(query, Order.class);
        List<Order> orderList = typedQuery.getResultList();
        return orderList;
    }

    public Order createOrder(Order product) {
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
}
