import entity.User;
import entity.UserInfo;
import service.IngredientService;
import service.ProductService;
import service.UserInfoService;
import service.UserService;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        UserInfoService userInfoService = new UserInfoService();
        ProductService productService = new ProductService();
        IngredientService ingredientService = new IngredientService();

        UserInfo userInfo = new UserInfo("Bamiestraat #12","Male", "12-12-1998" );

        UserInfo detail = userInfoService.createUserInfo(userInfo);

        User createUser = new User();
        createUser.setFirst_name("Dwayne");
        createUser.setLast_name("Ligma");
        createUser.setUsername("dwayne.ligma");
        createUser.setPassword("ligmaJohnson");
        createUser.setEmail("d.ligma@twitter.com");
        createUser.setUserInfoId(detail);

        userService.createUser(createUser);

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
