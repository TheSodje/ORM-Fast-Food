package com.sod.repository;

import java.util.List;

import com.sod.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class ProductRepository {
    private Product product;

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

    public List<Product> getAllProducts() {
        String query = "select p from Product p";
        TypedQuery<Product> typedQuery = entityManager.createQuery(query, Product.class);
        return typedQuery.getResultList();
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

    public Product createProduct(String name, String type, String price) {
        product = new Product();
        product.setName(name);
        product.setType(type);
        product.setPrice(price);
        return createProduct(product);
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

    public Product findOneProductbyId(int id) {
        Product product = entityManager.find(Product.class, id);
        if (product == null) {
            throw new EntityNotFoundException("Can't find product for ID "
                    + id);
        }
        return product;
    }

    public Product findOneProduct(String productName) {
        String findProductName = "select p from Product p where p.name = :productName";
        Query query = entityManager.createQuery(findProductName);
        query.setParameter("productName", productName);
        Object singleResult = ((Query) query).getSingleResult();
        return (Product) singleResult;
    }

}