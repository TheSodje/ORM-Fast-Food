package com.sod.controller;

import com.sod.dto.ProductDTO;
import com.sod.entity.Product;
import com.sod.service.ProductService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/product")
public class ProductController {

    ProductService productService = new ProductService();

    @Path("/addProduct")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Product createProduct(ProductDTO productDTO) {
        return productService.createProduct(productDTO.getName(), productDTO.getType(), productDTO.getDescription(),
                productDTO.getPrice());
    }

    @Path("/getProducts")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Product> allProducts() {
        return productService.getProduct();
    }

    @Path("/getProduct/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Product singleProduct(@PathParam("id") int id) {
        return productService.getSingleProduct(id);
    }

    @Path("/deleteProduct/{id}")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteProductid(@PathParam("id") int id) {
        Product deleteProduct = productService.getSingleProduct(id);
        productService.deleteProduct(deleteProduct);
    }

}
