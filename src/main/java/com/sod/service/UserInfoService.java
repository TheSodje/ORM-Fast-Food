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

    public List<UserInfo> getUserInfo() {
        return userInfoRepository.getUserInfo();
    }
}