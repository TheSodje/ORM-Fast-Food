package com.sod.controller;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import com.sod.dto.ProductDTO;
import com.sod.entity.Product;
import com.sod.mapper.ProductDTOMapper;
import com.sod.service.ProductService;
import java.util.List;

@Path("/product")
public class ProductController {

    ProductDTOMapper productDTOMapper = new ProductDTOMapper();
    ProductService productService = new ProductService(productDTOMapper);

    @Path("/getProducts")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductDTO> products() {
        return productService.getAllProducts();
    }


    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Product add(Product product) {
        return productService.createProduct(toString(), toString(), "");
    }

    @Path("/delete")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void remove(Product product) {
        productService.deleteProduct(product);
    }


    @Path("/update")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Product update(Product product) {
        return productService.updateProduct(product);
    }

    @Path("/find")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Product findDier(Product product) {
        return productService.findProductById(product.getId());
    }

}