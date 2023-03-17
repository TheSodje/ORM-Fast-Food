package com.sod.service;

import java.time.LocalDateTime;
import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.Orders;
import com.sod.entity.Product;
import com.sod.repository.OrdersRepository;

public class OrdersService {
    private final OrdersRepository repository;

    public OrdersService() {
        this.repository = new OrdersRepository(JPAConfiguration.getEntityManager());
    }

    public List<Orders> getOrder() {
        return repository.getOrder();
    }

    public Orders createOrder(String orderCode, String status, List<Product> product, LocalDateTime date) {
        return repository.createOrder(orderCode, status, product, date);
    }

}
