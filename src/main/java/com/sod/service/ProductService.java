package com.sod.service;

import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.Product;
import com.sod.mapper.ProductDTOMapper;
import com.sod.repository.OrderRepository;
import com.sod.repository.ProductRepository;
import com.sod.dto.ProductDTO;

import java.util.stream.Collectors;

public class ProductService {
    private final ProductRepository repository;

    private final ProductDTOMapper productDTOMapper;

    public ProductService(ProductDTOMapper productDTOMapper) {
        this.productDTOMapper = productDTOMapper;
        this.repository = new ProductRepository(JPAConfiguration.getEntityManager());
    }

//    public ProductService() {
//        this.repository = new ProductRepository(JPAConfiguration.getEntityManager());
//    }

    public List<ProductDTO> getAllProducts() {
        return repository.getAllProducts().stream().map(productDTOMapper).collect(Collectors.toList());
    }

    public List<Product> getProducts() {
        return repository.getProducts();
    }

    public Product createProduct(String name, String type, String price) {
        return repository.createProduct(name, type, price);
    }

    public Product updateProduct(Product product) {
        return repository.updateProduct(product);
    }

    public Product deleteProduct(Product product) {
        return repository.deleteProduct(product);
    }

    public Product findProductByName(String productName) {
        return repository.findOneProduct(productName);
    }

    public Product findProductById(int id) {
        return repository.findOneProductbyId(id);
    }
}