package com.demo.ordersManager.service;

import com.demo.ordersManager.dto.Order;
import com.demo.ordersManager.repositories.OrderRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepositories orderRepositories;

    public OrderService(OrderRepositories orderRepositories) {
        this.orderRepositories = orderRepositories;
    }

    public Iterable<Order> getOrders() {
       return orderRepositories.findAll();
    }

    public void createOrder(Order order) {
       orderRepositories.save(order);
    }

    public void createBulkOrder(List<Order> orders) {
        orderRepositories.saveAll(orders);

    }
}
