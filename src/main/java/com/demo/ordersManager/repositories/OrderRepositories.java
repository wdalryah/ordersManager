package com.demo.ordersManager.repositories;


import com.demo.ordersManager.dto.Order;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface OrderRepositories extends  CrudRepository<Order, String> {
    Optional<Order> findById(String id);

}
