package com.maxiflexy.microservices.product.repository;

import com.maxiflexy.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
