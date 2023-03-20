package com.sod.repository;

import java.util.List;

import com.sod.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class ProductRepository {

    private EntityManager entityManager;

    public ProductRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Product> getProducts() {
        String query = "select g from Product g";
        TypedQuery<Product> typedQuery = entityManager.createQuery(query, Product.class);
        List<Product> productList = typedQuery.getResultList();
        return productList;
    }

    public Product createProduct(Product product) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(product);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return product;
    }

    public Product createProduct(String name, String descr, String type, Double price) {
        Product product = new Product();
        product.setName(name);
        product.setDescr(descr);
        product.setType(type);
        product.setPrice(price);
        return createProduct(product);
    }

    public Product deleteProduct(Product product) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(Product.class, product.getId());
            if (product != null)
                entityManager.remove(product);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return product;
    }

    public Product updateProduct(Product product) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(Product.class, product.getId());
            entityManager.merge(product);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return product;
    }
}
