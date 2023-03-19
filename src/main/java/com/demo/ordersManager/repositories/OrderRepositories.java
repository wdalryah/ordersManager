package com.demo.ordersManager.repositories;


import com.demo.ordersManager.dto.Order;
import com.demo.ordersManager.dto.OrderId;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@EnableScan
public interface OrderRepositories extends  CrudRepository<Order, OrderId> {
    List<Order> findById(String id);

}