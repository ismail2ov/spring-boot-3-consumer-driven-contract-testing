package com.paradigmadigital.catalog.infrastructure;

import com.paradigmadigital.catalog.domain.Product;
import com.paradigmadigital.catalog.domain.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<Products> getProducts() {

        var productsList = productService.getAll();
        var products = new Products(productsList);

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    public record Products(List<Product> products) {

    }

}
