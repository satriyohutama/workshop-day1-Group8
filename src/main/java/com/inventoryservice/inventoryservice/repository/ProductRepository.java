package com.inventoryservice.inventoryservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryservice.inventoryservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}

