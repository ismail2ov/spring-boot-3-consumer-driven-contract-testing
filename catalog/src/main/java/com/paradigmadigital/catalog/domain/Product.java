package com.paradigmadigital.catalog.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {

    @Id
    private Long productId;

    private String productName;

    private String price;
}
