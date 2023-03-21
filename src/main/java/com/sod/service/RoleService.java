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

    public List<Role> getRole() {
        return RoleRepository.getRole();
    }

}