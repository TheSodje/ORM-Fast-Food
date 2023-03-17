package com.sod;

import java.time.LocalDateTime;

import com.sod.entity.*;
import com.sod.service.*;

public class Main {

  public static void main(String[] args) {

    // UserService userService = new UserService();
    // UserInfoService userInfoService = new UserInfoService();
    ProductService productService = new ProductService();
    OrdersService ordersService = new OrdersService();

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

    Orders orders = new Orders();
    // order.setDate(2022-02-02);

    orders = ordersService.createOrder("10001", "Pending", productService.getProducts(), LocalDateTime.now());
    System.out.println(orders.getCode());
    System.out.println(orders.getStatus());
    System.out.println(orders.getDate());

    /*----------------------------------------------------------------------------------------------------------*/

    Product product = new Product();
    product = productService.createProduct("Shoarma", "Desert", 5);
    System.out.println(product.getName());
    System.out.println(product.getType());
    System.out.println(product.getPrice());

    /*----------------------------------------------------------------------------------------------------------*/

    
    // EntityManager entityManager;
    //
    // Orders order = entityManager.find(Orders.class, 1);
    // Product product = entityManager.find(Product.class, 2);
    // OrderProduct orderProduct = new OrderProduct();
    // orderProduct.setOrder(order);
    // orderProduct.setProduct(product);
    // orderProduct.setQuantity(10);
    // order.getOrderProducts().add(orderProduct);
    // entityManager.persist(order);

  }
}
