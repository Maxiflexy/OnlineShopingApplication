package com.maxiflexy.microservices.inventory.service.impl;

import com.maxiflexy.microservices.inventory.reposiroty.InventoryRepository;
import com.maxiflexy.microservices.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, Integer quantity){
        // find inventory for a given skuCode where quantity is greater than zero
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }
}
