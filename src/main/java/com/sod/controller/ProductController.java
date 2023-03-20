//package com.sod.controller;
//
//import java.util.List;
//
////import com.sod.dto.ProductDTO;
//import com.sod.entity.Product;
////import com.sod.mapper.ProductDTOMapper;
//import com.sod.service.ProductService;
//
//import jakarta.ws.rs.DELETE;
//import jakarta.ws.rs.FormParam;
//import jakarta.ws.rs.GET;
//import jakarta.ws.rs.POST;
//import jakarta.ws.rs.PUT;
//import jakarta.ws.rs.Path;
//import jakarta.ws.rs.PathParam;
//import jakarta.ws.rs.Produces;
//import jakarta.ws.rs.QueryParam;
//import jakarta.ws.rs.core.MediaType;
//import jakarta.ws.rs.core.Response;
//
//@Path("/product")
//public class ProductController {
//
//    ProductDTOMapper productDTOMapper = new ProductDTOMapper();
//    ProductService productService = new ProductService(productDTOMapper);
//
//    @Path("/get_producten")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<ProductDTO> beschikbareProducten() {
//        return productService.getProducts();
//    }
//
//    @Path("/add")
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    public Product add(@FormParam("name") String name,
//                       @FormParam("descr") String descr,
//                       @FormParam("type") String type,
//                       @FormParam("price") Double price) {
//        return productService.createProduct(name, descr, type, price);
//    }
//
//    @Path("/remove/{id}")
//    @DELETE
//    public Response remove(@PathParam("id") int id) {
//        productService.deleteProduct(id);
//        return Response.noContent().build();
//    }
//
//    @Path("/updatePrice")
//    @PUT
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response updatePrice(@QueryParam("id") int id,
//                                @QueryParam("price") double price) {
//        Product product = productService.updatePrijs(id, price);
//        if (product == null) {
//            return Response.status(Response.Status.NOT_FOUND).build();
//        } else {
//            return Response.ok(product).build();
//        }
//    }
//
//    @Path("/find/{id}")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response findProductById(@PathParam("id") int id) {
//        Product product = productService.findProductById(id);
//        if (product == null) {
//            return Response.status(Response.Status.NOT_FOUND).build();
//        } else {
//            return Response.ok(product).build();
//        }
//    }
//
//    @Path("/findByName")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getUserByFullName(@QueryParam("productName") String productName) {
//        Product product = productService.findProductByName(productName);
//        if (product == null) {
//            return Response.status(Response.Status.NOT_FOUND).build();
//        } else {
//            return Response.ok(product).build();
//        }
//    }
//
//}
