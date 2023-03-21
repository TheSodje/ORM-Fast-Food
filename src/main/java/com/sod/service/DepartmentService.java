package com.sod.service;

import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.Department;
import com.sod.repository.DepartmentRepository;

public class DepartmentService {
  private final DepartmentRepository deparmentRepository;

  public DepartmentService() {
    this.deparmentRepository = new DepartmentRepository(JPAConfiguration.getEntityManager());
  }

  public Department createContactUs(Department department) {
    return deparmentRepository.createDepartment(department);
  }

  public Department createContactUs(String name) {
    return deparmentRepository.createDepartment(name);
  }

  public List<Department> getDepartment() {
    return deparmentRepository.getDepartment();
  }
}
