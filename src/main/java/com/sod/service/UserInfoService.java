package com.sod.service;

import java.util.List;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.UserInfo;
import com.sod.repository.UserInfoRepository;

public class UserInfoService {

    private UserInfoRepository userInfoRepository;

    public UserInfoService() {
        this.userInfoRepository = new UserInfoRepository(JPAConfiguration.getEntityManager());
    }

    // CRUD USERINFO
    public UserInfo createUserInfo(UserInfo userInfo) {
        return userInfoRepository.createUserInfo(userInfo);
    }

    public List<UserInfo> getUsers() {
        return userInfoRepository.getUserInfo();
    }

    public UserInfo updateUserInfo(UserInfo userInfo) {
        return userInfoRepository.updateUserInfo(userInfo);
    }

    public UserInfo deleteUserInfo(UserInfo userInfo) {
        return userInfoRepository.deleteUserInfo(userInfo);
    }
}