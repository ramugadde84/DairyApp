package com.sample.test.TestDemo.dao;

import com.sample.test.TestDemo.Hero;
import com.sample.test.TestDemo.entities.User;
import com.sample.test.TestDemo.entities.UserDataInfo;
import com.sample.test.TestDemo.entities.UserInformationEntity;
import com.sample.test.TestDemo.model.UserInformation;

import java.util.List;


public interface JPADao {
    public void save(Hero hero);
    public List<User> fetchUserData();
    public List<User> fetchUserData(String username);
    public void saveUserInformation(UserInformationEntity userInformationEntity);
    public List<UserInformation> fetchAllUserInformation();
    public List<UserDataInfo> fetchUserInfoData();
}
