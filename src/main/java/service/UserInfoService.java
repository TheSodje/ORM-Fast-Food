package service;

import configuration.JPAConfiguration;
import entity.UserInfo;
import repository.UserInfoRepository;

public class UserInfoService {

    private UserInfoRepository userInfoRepository;

    public UserInfoService() {
        this.userInfoRepository = new UserInfoRepository(JPAConfiguration.getEntityManager());
    }

    public UserInfo createUserInfo(UserInfo userInfo){
        return userInfoRepository.createUserInfo(userInfo);
    }
//    public UserInfo updateUserInfo(UserInfo userInfo){
//        return userInfoRepository.updateUserInfo(userInfo);
//    }
//   public UserInfo deleteUserInfo(UserInfo userInfo){
//         return userInfoRepository.deleteUserInfo(userInfo);
//    }

    public UserInfo updateUserInfo(UserInfo userInfo) {
        return userInfoRepository.updateUserInfo(userInfo);
    }

    public UserInfo deleteUserInfo(UserInfo userInfo) {
        return userInfoRepository.deleteUserInfo(userInfo);
    }
}
