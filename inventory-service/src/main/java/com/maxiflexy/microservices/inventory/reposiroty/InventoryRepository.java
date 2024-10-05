package com.maxiflexy.microservices.inventory.reposiroty;

import com.maxiflexy.microservices.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    boolean existsBySkuCodeAndQuantityIsGreaterThanEquals(String skuCode, Integer quantity);
}
