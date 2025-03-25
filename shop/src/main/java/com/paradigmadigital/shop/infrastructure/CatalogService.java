package com.paradigmadigital.shop.infrastructure;

import com.paradigmadigital.shop.domain.Product;
import com.paradigmadigital.shop.domain.Products;
import java.util.List;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CatalogService {

    public static final String CATALOG_URL = "http://localhost:8080/products";

    private final RestTemplate restTemplate;

    public Products getProducts() {
        Products products = restTemplate.getForEntity(CATALOG_URL, Products.class).getBody();

        List<Product> result = Objects.requireNonNull(products).products().stream().map(product -> product.withQuantity(1)).toList();

        return new Products(result);

    }
}
