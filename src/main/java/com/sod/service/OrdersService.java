package com.sod.service;

import java.time.LocalDateTime;
import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.Orders;
import com.sod.entity.Product;
import com.sod.repository.OrdersRepository;

public class OrdersService {
    private final OrdersRepository orderRepository;

    public OrdersService() {
        this.orderRepository = new OrdersRepository(JPAConfiguration.getEntityManager());
    }

    public Orders createOrder(Orders orders) {
        return orderRepository.createOrder(orders);
    }

    public Orders createOrder(String orderCode, String status, List<Product> product, LocalDateTime date) {
        return orderRepository.createOrder(orderCode, status, product, date);
    }

    public List<Orders> getOrder() {
        return orderRepository.getOrder();
    }

    public Orders updateOrder(Orders orders) {
        return orderRepository.updateOrder(orders);
    }

    public Orders deleteOrder(Orders orders) {
        return orderRepository.deleteOrder(orders);
    }


}
