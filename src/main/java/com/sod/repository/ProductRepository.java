package com.sod.repository;

import java.util.List;

import com.sod.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class ProductRepository {

    private EntityManager entityManager;

    public ProductRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
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

    public List<Product> getProduct() {
        String query = "select p from Product p";
        TypedQuery<Product> typedQuery = entityManager.createQuery(query, Product.class);
        List<Product> productList = typedQuery.getResultList();
        return productList;
    }

    public Product getSingleProduct(int id) {
        Query query = entityManager.createQuery("select s from Product s where s.id = :id ");
        query.setParameter("id", id);
        Product result = (Product) query.getSingleResult();

        return result;
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

    public void deleteProduct(Product product) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(product);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public int deleteProductId(Long id) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Product p where p.id = :id");
        query.setParameter("id", id);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }

}
