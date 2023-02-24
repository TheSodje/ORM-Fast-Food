package com.sod.repository;

import com.sod.entity.UserInfo;

import jakarta.persistence.EntityManager;

public class UserInfoRepository {

    private EntityManager entityManager;

    public UserInfoRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public UserInfo createUserInfo(UserInfo userInfo) {
        // public UserInfo updateUserInfo(UserInfo userInfo) {
        // public UserInfo deleteUserInfo(UserInfo userInfo) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(userInfo);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userInfo;
    }

    public UserInfo deleteUserInfo(UserInfo userInfo) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(UserInfo.class, userInfo.getId());
            if (userInfo != null)
                entityManager.remove(userInfo);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return userInfo;
    }

    public UserInfo updateUserInfo(UserInfo userInfo) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(UserInfo.class, userInfo.getId());
            entityManager.merge(userInfo);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return userInfo;
    }
}
