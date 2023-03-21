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

    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    public List<User> getUser() {
        return userRepository.getUser();
    }

    public void save(User user) {
    }
}