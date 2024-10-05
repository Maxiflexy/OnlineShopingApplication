package com.maxiflexy.microservices.order.service;

import com.maxiflexy.microservices.order.dto.OrderRequest;

public interface OrderService {

    void placeOrder(OrderRequest orderRequest);
}
