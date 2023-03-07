package com.demo.ordersManager.api;

import com.demo.ordersManager.dto.Order;
import com.demo.ordersManager.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service")
public class OrderApi {

    private final OrderService orderService;

    public OrderApi(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public Iterable<Order> getOrders(){
        return orderService.getOrders();
    }

    @PostMapping
    public void addOrder(@RequestBody Order order){
        orderService.createOrder(order);
    }
    @PostMapping("/bulk")
    public void addBulkOrder(@RequestBody List<Order> orders){
        orderService.createBulkOrder(orders);
    }
}
