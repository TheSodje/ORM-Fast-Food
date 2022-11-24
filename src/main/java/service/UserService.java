package service;

import configuration.JPAConfiguration;
import entity.User;
import repository.UserRepository;

import java.util.List;

public class UserService {

    private final UserRepository repository;

    public UserService() {
        this.repository = new UserRepository(JPAConfiguration.getEntityManager());
    }

    public List<User> getUsers() {
        return repository.getUsers();
    }

    public User createUser(User user) {
        return repository.createUser(user);
    }

//    public boolean UpdateUserEmail(Long id, String email){
//        int totalSaved = repository.updateUser(id, email);
//
//        if(totalSaved>0){
//            System.out.println("update user email");
//            return true;
//        }
//        return false;
//    }

//    public User deleteUser(User user) {
//        return repository.deleteUser(user);
//    }

    public User updateUser(User user) { return repository.updateUser(user);}

    public User deleteUser(User user) { return repository.deleteUser(user);}
}
