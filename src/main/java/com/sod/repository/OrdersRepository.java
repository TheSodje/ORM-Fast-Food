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

    public Orders createOrder(Orders orders) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(orders);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return orders;
    }

    public Orders createOrder(String orderCode, String status, List<Product> product, LocalDateTime date) {
        Orders orders = new Orders();
        orders.setCode(orderCode);
        orders.setStatus(status);
        orders.setDate(date);
        return createOrder(orders);
    }

    public List<Orders> getOrder() {
        String query = "select o from Orders o";
        TypedQuery<Orders> typedQuery = entityManager.createQuery(query, Orders.class);
        List<Orders> orderList = typedQuery.getResultList();
        return orderList;
    }

    public Orders updateOrder(Orders orders) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(Orders.class, orders.getId());
            entityManager.merge(orders);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return orders;
    }

    public Orders deleteOrder(Orders orders) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(Orders.class, orders.getId());
            if (orders != null)
                entityManager.remove(orders);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return orders;
    }
}
