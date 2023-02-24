package com.sod.repository;

import java.util.List;

import com.sod.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class UserRepository {

    private EntityManager entityManager;

    public UserRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<User> getUsers() {
        String query = "select g from User g";
        TypedQuery<User> typedQuery = entityManager.createQuery(query, User.class);
        List<User> genderlist = typedQuery.getResultList();
        return genderlist;
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

    // public int updateUser(Long id, String email) {
    // entityManager.getTransaction().begin();
    // Query query = entityManager.createQuery("UPDATE User g set g.email= :email
    // WHERE g.id= :id");
    // query.setParameter("email",email);
    // query.setParameter("id",id);
    // int i = query.executeUpdate();
    //
    // entityManager.getTransaction().commit();
    // return i;
    // }

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
            /*
             * String findQuery = "from User where id = :user_id";
             * Query query = entityManager.createQuery(findQuery);
             * query.setParameter("user_id", user.getId());
             */
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
