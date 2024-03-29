package com.sod.controller;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import com.sod.entity.Orders;
import com.sod.service.OrdersService;

@Path("/orders")
public class OrdersController {
    OrdersService orderService = new OrdersService();

    @Path("/getOrders")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Orders> allOrders() {
        return orderService.getOrder();
    }
}
