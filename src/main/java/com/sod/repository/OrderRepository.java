package com.sod.repository;

import java.time.LocalDate;
import java.util.List;

import com.sod.entity.Order;
import com.sod.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class OrderRepository {

    private final EntityManager entityManager;

    public OrderRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Order> getOrder() {
        String query = "select g from Order g";
        TypedQuery<Order> typedQuery = entityManager.createQuery(query, Order.class);
        return typedQuery.getResultList();
    }

    private Order createOrder(Order product) {
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


    public  Order createOrder(String orderCode, int quantity, String status, List<Product> product){
        Order order = new Order();
        order.setOrder_code(orderCode);
        order.setQuantity(quantity);
        order.setStatus(status);
        order.setDate(LocalDate.now());
        order.setProduct(product);
        return createOrder(order);
    }


}
