package com.inventoryservice.inventoryservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryservice.inventoryservice.dto.ProductRequest;
import com.inventoryservice.inventoryservice.model.Product;
import com.inventoryservice.inventoryservice.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired 
    ProductRepository productRepository;

    public Product createProduct(ProductRequest productRequest) {
        Product newProduct = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        return productRepository.save(newProduct);
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
