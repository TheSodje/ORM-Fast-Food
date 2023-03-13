package com.sod;

import com.sod.entity.Order;
import com.sod.entity.Product;
import com.sod.entity.User;
import com.sod.entity.UserInfo;
import com.sod.service.UserInfoService;
import com.sod.service.UserService;
import com.sod.mapper.ProductDTOMapper;
import com.sod.service.OrderService;
import com.sod.service.ProductService;
import jakarta.ws.rs.GET;

public class Main {

    private static ProductDTOMapper productDTOMapper;

    // public static void main(String[] args, String shoarma) {
    
    // UserService userService = new UserService();
    // UserInfoService userInfoService = new UserInfoService();
//   ProductService productService = new ProductService(productDTOMapper);
//    OrderService orderService = new OrderService();

    /*----------------------------------------------------------------------------------------------------------*/
    // UserInfo userInfo = new UserInfo("Bamiestraat #12","Male", "12-12-1998" );

//    UserInfo userInfo = new UserInfo();
//    userInfo.setAddress("Elisabethshof #3");
//    userInfo.setGender("Male");
//    // userInfo.setBirthDate("12-12-1992");
//
//    UserInfo detail = userInfoService.createUserInfo(userInfo);

    /*----------------------------------------------------------------------------------------------------------*/

    // User createUser = new User();
    // createUser.setFirst_name("Dwayne");
    // createUser.setLast_name("Ligma");
    // createUser.setUsername("dwayne.ligma");
    // createUser.setPassword("ligmaJohnson");
    // createUser.setEmail("d.ligma@twitter.com");
//    createUser.setUserInfoId(detail);

    // userService.createUser(createUser);

    /*----------------------------------------------------------------------------------------------------------*/

//    Product product = new Product();
//    product.setProduct_name("Hamburger");
//    product.setProduct_price("SRD 100");
//
//    Product product1 = productService.createProduct(product);

    /*----------------------------------------------------------------------------------------------------------*/

//  Order order = new Order();
//  // order.setDate(2022-02-02);

//  order = orderService.createOrder("10001", "Pending", productService.getProducts());
//  System.out.println(order.getOrder_code());
   /*----------------------------------------------------------------------------------------------------------*/
        public static void main(String[] args) {

    ProductService productService = new ProductService(productDTOMapper);

    productService.createProduct("Shoarma", "Main Dish", "100.00");
    productService.createProduct("Fries", "Appetizer", "30.00");
    productService.createProduct("Wings", "Appitizer", "60.00");
    productService.createProduct("Chocolate Cake", "Desert", "50.00");

        }
 }
// }
