import entity.Order;
import entity.Product;
import entity.User;
import entity.UserInfo;
import service.OrderService;
import service.ProductService;
import service.UserInfoService;
import service.UserService;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        UserInfoService userInfoService = new UserInfoService();
        ProductService productService = new ProductService();
        OrderService orderService = new OrderService();


        /*----------------------------------------------------------------------------------------------------------*/
//        UserInfo userInfo = new UserInfo("Bamiestraat #12","Male", "12-12-1998" );

        UserInfo userInfo = new UserInfo();
        userInfo.setAddress("Elisabethshof #3");
        userInfo.setGender("Male");
        userInfo.setBirthDate("12-12-1992");

        UserInfo detail = userInfoService.createUserInfo(userInfo);


        /*----------------------------------------------------------------------------------------------------------*/

        User createUser = new User();
        createUser.setFirst_name("Dwayne");
        createUser.setLast_name("Ligma");
        createUser.setUsername("dwayne.ligma");
        createUser.setPassword("ligmaJohnson");
        createUser.setEmail("d.ligma@twitter.com");
        createUser.setUserInfoId(detail);

        userService.createUser(createUser);


        /*----------------------------------------------------------------------------------------------------------*/


        Product product = new Product();
        product.setProduct_name("Hamburger");
        product.setProduct_price("SRD 100");

        Product product1 = productService.createProduct(product);

        /*----------------------------------------------------------------------------------------------------------*/

        Order order = new Order();
        order.setOrder_code("Aardappel");
        order.setQuantity(2L);
        order.setStatus("Pending");
//        order.setDate(2022-02-02);

        Order order1 = orderService.createOrder(order);


        /*----------------------------------------------------------------------------------------------------------*/


//        userService.UpdateUserEmail(1l, "O.Blaxk@unasat.sr");

//        UserInfo detail = userInfoService.deleteUserInfo(userInfo);
//
//        User deleteUser = new User();
//        deleteUser.setLast_name("P'Neil");
//        deleteUser.setUserInfoId(detail);
//
//        userService.deleteUser(deleteUser);

//        createUser.setFirst_name("Pax");
//        createUser.setLast_name("Yellow");
//        createUser.setEmail("tranquilo@twitter.com");
//        userService.updateUser(createUser);
//        userService.deleteUser(createUser);

                /*List<User> users = userService.getUsers();
        users.forEach( user -> {
            System.out.println("First_name = " + user.getFirst_name() + "Last_name = " + user.getLast_name());
        });*/
    }
}
