package com.paradigmadigital.shop.domain;

public record Product(Long id, String name, Price price, Integer quantity) {

    public Product withQuantity(int quantity) {
        return new Product(this.id, this.name, this.price, quantity);
    }
}
