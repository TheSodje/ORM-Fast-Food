package com.sod.service;

import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.repository.OrderRepository;

public class OrderService {
    private final OrderRepository repository;

    public OrderService() {
        this.repository = new OrderRepository(JPAConfiguration.getEntityManager());
    }

    public List<Order> getOrder() {
        return repository.getOrder();
    }

    public Order createOrder(Order order) {
        return repository.createOrder(order);
    }

}
