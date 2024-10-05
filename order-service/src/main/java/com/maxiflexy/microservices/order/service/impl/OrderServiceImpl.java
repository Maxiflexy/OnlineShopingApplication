package com.maxiflexy.microservices.order.service.impl;

import com.maxiflexy.microservices.order.client.InventoryClient;
import com.maxiflexy.microservices.order.dto.OrderRequest;
import com.maxiflexy.microservices.order.model.Order;
import com.maxiflexy.microservices.order.repository.OrderRepository;
import com.maxiflexy.microservices.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient;

    public void placeOrder(OrderRequest orderRequest){

        var isProductInStock = inventoryClient.isInStock(orderRequest.skuCode(), orderRequest.quantity());
        if(isProductInStock){
            // map OrderRequest to Order object
            Order order = new Order();
            order.setOrderNumber(UUID.randomUUID().toString());
            order.setPrice(orderRequest.price());
            order.setSkuCode(orderRequest.skuCode());
            order.setQuantity(orderRequest.quantity());

            orderRepository.save(order);
        }else {
            throw new RuntimeException("Product with SkuCode " + orderRequest.skuCode() + " is not in Stock");
        }

    }
}
