package service;

import configuration.JPAConfiguration;
import entity.Product;
import repository.ProductRepository;

import java.util.List;

public class ProductService {

    private final ProductRepository repository;

    public ProductService() {
        this.repository = new ProductRepository(JPAConfiguration.getEntityManager());
    }

    public List<Product> getProducts() {
        return repository.getProducts();
    }

    public Product createProduct(Product product) { return repository.createProduct(product);}

    public Product updateProduct(Product product) { return repository.updateProduct(product);}

    public Product deleteProduct(Product product) { return repository.deleteProduct(product);}
}
