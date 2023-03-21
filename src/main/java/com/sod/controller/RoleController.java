package com.sod.controller;

import com.sod.entity.Role;
import com.sod.service.RoleService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/role")
public class RoleController {

    RoleService roleService = new RoleService();

    @Path("/get_roles")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Role> allRoles() {
        return roleService.getRole();
    }
}
