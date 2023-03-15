package com.sod.repository;

import java.util.List;

import com.sod.entity.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class DepartmentRepository {

    private EntityManager entityManager;

    public DepartmentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Department createDepartment(Department department) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(department);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return department;
    }

    public Department createDepartment(String name) {
        Department department = new Department();
        department.setName(name);
        return createDepartment(name);
    }

    public List<Department> getDepartment() {
        String query = "select g from Department g";
        TypedQuery<Department> typedQuery = entityManager.createQuery(query, Department.class);
        List<Department> departmentList = typedQuery.getResultList();
        return departmentList;
    }

}