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

    public List<Department> getDepartment() {
        String query = "select g from Department g";
        TypedQuery<Department> typedQuery = entityManager.createQuery(query, Department.class);
        List<Department> departmentList = typedQuery.getResultList();
        return departmentList;
    }

}
