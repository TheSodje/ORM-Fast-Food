package com.sod.controller;

import com.sod.entity.Product;
import com.sod.service.ProductService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/product")
public class ProductController {

    ProductService productService = new ProductService();

    @Path("/get_products")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> allProducts() {
        return productService.getProduct();
    }

    @Path("/get_product/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> singleProduct(@PathParam("id") int id) {
        return productService.getSingleProduct(id);
    }

}
