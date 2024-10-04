package com.maxiflexy.microservices.product.service;

import com.maxiflexy.microservices.product.dto.ProductRequest;
import com.maxiflexy.microservices.product.dto.ProductResponse;
import com.maxiflexy.microservices.product.model.Product;

import java.util.List;

public interface ProductService {

    ProductResponse createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
