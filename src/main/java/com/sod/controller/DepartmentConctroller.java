package com.sod.controller;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import com.sod.entity.Department;
import com.sod.service.DepartmentService;
import java.util.List;

@Path("/department")
public class DepartmentConctroller {

    DepartmentService departmentService = new DepartmentService();

    @Path("/getDepartments")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Department> allDepartments() {
        return departmentService.getDepartment();
    }

}
