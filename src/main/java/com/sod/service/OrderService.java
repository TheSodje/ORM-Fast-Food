package com.sod.service;

import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.Order;
import com.sod.entity.Product;
import com.sod.repository.OrderRepository;

public class OrderService {
    private final OrderRepository repository;

    public OrderService() {
        this.repository = new OrderRepository(JPAConfiguration.getEntityManager());
    }

    public List<Order> getOrder() {
        return repository.getOrder();
    }

    public Order createOrder(String orderCode, int quantity, String status, List<Product> product) {
        return repository.createOrder(orderCode, quantity, status, product);
    }

}
