package com.sod.service;

import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.Department;
import com.sod.repository.DepartmentRepository;

public class DepartmentService {
  private final DepartmentRepository repository;

  public DepartmentService() {
    this.repository = new DepartmentRepository(JPAConfiguration.getEntityManager());
  }

  public List<Department> getDepartment() {
    return repository.getDepartment();
  }
}
