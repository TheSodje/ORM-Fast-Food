package com.sod.repository;

import java.util.List;

import com.sod.entity.Role;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class RoleRepository {

    private EntityManager entityManager;

    public RoleRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Role createRole(Role role) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(role);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return role;
    }
    
    public List<Role> getRole() {
        String query = "select g from Role g";
        TypedQuery<Role> typedQuery = entityManager.createQuery(query, Role.class);
        List<Role> roleList = typedQuery.getResultList();
        return roleList;
    }

    public Role deleteRole(Role role) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(Role.class, role.getId());
            if (role != null)
                entityManager.remove(role);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return role;
    }

    public Role updateRole(Role role) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(Role.class, role.getId());
            entityManager.merge(role);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return role;
    }
}