package com.sod.service;

import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.Product;
import com.sod.repository.ProductRepository;

public class ProductService {

    private final ProductRepository productRrepository;

    public ProductService() {
        this.productRrepository = new ProductRepository(JPAConfiguration.getEntityManager());
    }
 
    public Product createProduct(Product product) {
        return productRrepository.createProduct(product);
    }

    public Product createProduct(String name, String descr, String type, Double price) {
        return productRrepository.createProduct(name, descr, type, price);
    }

    public List<Product> getProduct() {
        return productRrepository.getProduct();
    }

    public List<Product> getSingleProduct(int id){
        return productRrepository.getSingleProduct(id);
    }

    public Product updateProduct(Product product) {
        return productRrepository.updateProduct(product);
    }

    public Product deleteProduct(Product product) {
        return productRrepository.deleteProduct(product);
    }
}
