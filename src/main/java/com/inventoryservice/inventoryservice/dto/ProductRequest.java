package com.inventoryservice.inventoryservice.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequest {

    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;

}
