package com.sod;

import com.sod.entity.*;
import com.sod.service.*;
import com.sod.repository.*;

public class Main {

  public static void main(String[] args) {

    // UserService userService = new UserService();
    // UserInfoService userInfoService = new UserInfoService();
    ProductService productService = new ProductService();
    OrderService orderService = new OrderService();

    /*----------------------------------------------------------------------------------------------------------*/
    // UserInfo userInfo = new UserInfo("Bamiestraat #12","Male", "12-12-1998" );

    // UserInfo userInfo = new UserInfo();
    // userInfo.setAddress("Elisabethshof #3");
    // userInfo.setGender("Male");
    // // userInfo.setBirthDate("12-12-1992");
    //
    // UserInfo detail = userInfoService.createUserInfo(userInfo);

    /*----------------------------------------------------------------------------------------------------------*/

    // User createUser = new User();
    // createUser.setFirst_name("Dwayne");
    // createUser.setLast_name("Ligma");
    // createUser.setUsername("dwayne.ligma");
    // createUser.setPassword("ligmaJohnson");
    // // createUser.setEmail("d.ligma@twitter.com");
    // createUser.setUserInfoId(detail);
    //
    // userService.createUser(createUser);

    /*----------------------------------------------------------------------------------------------------------*/

    // Product product = new Product();
    // product.setProduct_name("Hamburger");
    // product.setProduct_price("SRD 100");
    //
    // Product product1 = productService.createProduct(product);

    /*----------------------------------------------------------------------------------------------------------*/

    Order order = new Order();
    // order.setDate(2022-02-02);

    order = orderService.createOrder("10001", "Pending", productService.getProducts());
    System.out.println(order.getCode());
    /*----------------------------------------------------------------------------------------------------------*/

  }
}
