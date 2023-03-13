package com.sod.service;

import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.User;
import com.sod.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository(JPAConfiguration.getEntityManager());
    }

    // CRUD USERS

    public User createUser(User user) {
        return userRepository.createUser(user);
    }
    
    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    public User deleteUser(User user) {
        return userRepository.deleteUser(user);
    }

    public void save(User user) {
    }
}