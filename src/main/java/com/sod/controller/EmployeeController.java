package com.sod.controller;

import java.util.List;

import com.sod.entity.User;
import com.sod.service.UserService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/user")
public class EmployeeController {
    UserService userService = new UserService();

    @Path("/getEmployees")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> allRoles() {
        return userService.getUser();
    }

    @Path("/getUserRoleDepartment")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> allUserRoleDepartment() {
        return userService.getUserRoleDepartment();
    }
}
