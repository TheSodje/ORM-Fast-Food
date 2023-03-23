package com.sod.repository;

import org.junit.jupiter.api.Test;

import com.sod.service.ProductService;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    ProductService productService = new ProductService();

    @Test
    void createProduct() {

        productService.createProduct("Omellete magnifique", "Dish with egg, sprinkled with special seasoning", "Main Dish", 280.00);

        assertEquals(productService.getProduct().size(), 13);
    }

    @Test
    void getProducts() {
        assertEquals(12, productService.getProduct().size());
    }

    @Test
    void deleteProductId() {

    }
}