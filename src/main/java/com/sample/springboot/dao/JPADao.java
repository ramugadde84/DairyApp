package com.sample.springboot.dao;

import com.sample.springboot.entities.User;
import com.sample.springboot.entities.UserInformationEntity;
import com.sample.springboot.model.UserInformation;
import com.sample.springboot.entities.UserDataInfo;

import java.util.List;


public interface JPADao {
    public List<User> fetchUserData();
    public List<User> fetchUserData(String username);
    public void saveUserInformation(UserInformationEntity userInformationEntity);
    public List<UserInformation> fetchAllUserInformation();
    public List<UserDataInfo> fetchUserInfoData();
}
