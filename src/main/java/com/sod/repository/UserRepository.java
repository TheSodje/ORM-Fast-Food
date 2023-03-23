package com.sod.repository;

import java.util.List;

import com.sod.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class UserRepository {

    private EntityManager entityManager;

    public UserRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public User createUser(User user) {
        // public User deleteUser(User user){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return user;
    }

    public List<User> getUser() {
        String query = "select u from User u";
        TypedQuery<User> typedQuery = entityManager.createQuery(query, User.class);
        List<User> userList = typedQuery.getResultList();
        return userList;
    }

    public List<User> getUserRoleDepartment() {
        Query query = entityManager.createQuery("select u.first_name as firstname , u.last_name as lastname, r.name as role, d.name as department from User u inner join u.role r inner join r.department d");
        List<User> userRoleDepartmentList = query.getResultList();
        return userRoleDepartmentList;

        // String query = "select u.first_name as firstname , u.last_name as lastname, r.name as role, d.name as department from User u inner join u.role r inner join r.department d ";
        // TypedQuery<User> typedQuery = entityManager.createQuery(query, User.class);
        // List<User> userRoleDepartmentList = typedQuery.getResultList();
        // return userRoleDepartmentList;
    }

    public User deleteUser(User user) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(User.class, user.getId());
            if (user != null)
                entityManager.remove(user);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return user;
    }

    public User updateUser(User user) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(User.class, user.getId());
            entityManager.merge(user);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return user;
    }
}