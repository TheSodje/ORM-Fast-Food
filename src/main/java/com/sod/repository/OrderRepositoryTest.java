package com.sod.repository;

import com.sod.entity.Order;
import com.sod.service.OrderService;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {

    @Test
    void createOrder() {

        OrderService orderService = new OrderService();

        orderService.createOrder("Aardappel", 2, "Pending");
        assertTrue(orderService.getOrder().size() == 1);
    }
}