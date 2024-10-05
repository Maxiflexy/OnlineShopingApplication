package com.maxiflexy.microservices.inventory.service;

public interface InventoryService {

    boolean isInStock(String skuCode, Integer quantity);
}
