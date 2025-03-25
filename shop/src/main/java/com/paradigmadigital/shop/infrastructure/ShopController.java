package com.paradigmadigital.shop.infrastructure;

import com.paradigmadigital.shop.domain.Products;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ShopController {

    private final CatalogService catalogService;

    @GetMapping("/products")
    public ResponseEntity<Products> getProducts() {

        var products = catalogService.getProducts();

        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
