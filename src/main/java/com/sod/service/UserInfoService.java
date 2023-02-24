package com.sod.service;

import com.sod.configuration.JPAConfiguration;
import com.sod.entity.UserInfo;
import com.sod.repository.UserInfoRepository;

public class UserInfoService {

    private UserInfoRepository userInfoRepository;

    public UserInfoService() {
        this.userInfoRepository = new UserInfoRepository(JPAConfiguration.getEntityManager());
    }

    public UserInfo createUserInfo(UserInfo userInfo) {
        return userInfoRepository.createUserInfo(userInfo);
    }
    // public UserInfo updateUserInfo(UserInfo userInfo){
    // return userInfoRepository.updateUserInfo(userInfo);
    // }
    // public UserInfo deleteUserInfo(UserInfo userInfo){
    // return userInfoRepository.deleteUserInfo(userInfo);
    // }

    public UserInfo updateUserInfo(UserInfo userInfo) {
        return userInfoRepository.updateUserInfo(userInfo);
    }

    public UserInfo deleteUserInfo(UserInfo userInfo) {
        return userInfoRepository.deleteUserInfo(userInfo);
    }
}
