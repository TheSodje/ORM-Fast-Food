package com.sod.service;

import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.Role;
import com.sod.repository.RoleRepository;

public class RoleService {

    private RoleRepository RoleRepository;

    public RoleService() {
        this.RoleRepository = new RoleRepository(JPAConfiguration.getEntityManager());
    }

    // CRUD ROLE
    public Role createRole(Role role) {
        return RoleRepository.createRole(role);
    }

    public List<Role> getUsers() {
        return RoleRepository.getRole();
    }

    public Role updateRole(Role role) {
        return RoleRepository.updateRole(role);
    }

    public Role deletRole(Role role) {
        return RoleRepository.deleteRole(role);
    }
}