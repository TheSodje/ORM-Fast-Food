package com.sod;

import com.sod.entity.*;
import com.sod.service.*;

public class Main {

    public static void main(String[] args) {

        // UserService userService = new UserService();
        // UserInfoService userInfoService = new UserInfoService();
//        ProductService productService = new ProductService();
        // OrdersService ordersService = new OrdersService();
//        ContactUsService contactUsService = new ContactUsService();

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

        // /*----------------------------------------------------------------------------------------------------------*/

//        Product product = new Product();
//
//        product = productService.createProduct("Shoarma", "Desert", "Desert", 5.0);
//        System.out.println(product.getName());
//        System.out.println(product.getDesc());
//        System.out.println(product.getType());
//        System.out.println(product.getPrice());

        /*----------------------------------------------------------------------------------------------------------*/

        // Orders orders = new Orders();
        // // order.setDate(2022-02-02);

        // orders = ordersService.createOrder("10001", "Pending",
        // productService.getProducts(), LocalDateTime.now());
        // System.out.println(orders.getCode());
        // System.out.println(orders.getStatus());
        // System.out.println(orders.getDate());

        /*----------------------------------------------------------------------------------------------------------*/

//         ContactUs contact = new ContactUs();
//
//         contact = ContactUsService.createContactUs("Shoarma", "Desert@sda.co", "72772", "Hello");
//         System.out.println(contact.getName());
//         System.out.println(contact.getEmail());
//         System.out.println(contact.getNumber());
//         System.out.println(contact.getMessage());

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
