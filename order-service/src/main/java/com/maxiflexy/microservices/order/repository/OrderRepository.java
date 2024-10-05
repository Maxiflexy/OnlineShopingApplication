package com.maxiflexy.microservices.order.repository;

import com.maxiflexy.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
