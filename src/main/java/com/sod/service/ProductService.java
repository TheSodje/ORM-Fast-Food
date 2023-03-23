package com.sod.service;

import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.Product;
import com.sod.repository.ProductRepository;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService() {
        this.productRepository = new ProductRepository(JPAConfiguration.getEntityManager());
    }

    public Product createProduct(Product product) {
        return productRepository.createProduct(product);
    }

    public Product createProduct(String name, String descr, String type, Double price) {
        return productRepository.createProduct(name, descr, type, price);
    }

    public List<Product> getProduct() {
        return productRepository.getProduct();
    }

    public Product getSingleProduct(int id) {
        return productRepository.getSingleProduct(id);
    }

    public Product updateProduct(Product product) {
        return productRepository.updateProduct(product);
    }

    public void deleteProduct(Product product) {
        productRepository.deleteProduct(product);
    }

}
