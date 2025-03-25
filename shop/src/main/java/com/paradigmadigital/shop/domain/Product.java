package com.paradigmadigital.shop.domain;

public record Product(Long productId, String productName, String price, Integer quantity) {

    public Product withQuantity(int quantity) {
        return new Product(this.productId, this.productName, this.price, quantity);
    }
}
