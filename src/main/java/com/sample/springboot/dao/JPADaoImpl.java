package com.sample.springboot.dao;

import com.sample.springboot.entities.User;
import com.sample.springboot.entities.UserDataInfo;
import com.sample.springboot.entities.UserInformationEntity;
import com.sample.springboot.model.UserInformation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class JPADaoImpl implements JPADao  {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> fetchUserData() {
        Query query = entityManager.createNamedQuery("fetchUserData");

        List<User> users = query.getResultList();

        return users;
    }


    public List<User> fetchUserData(String username) {
        Query query = entityManager.createNamedQuery("fetchUserData");

        List<User> users = query.getResultList();

        return users;
    }

    @Override
    @Transactional
    public void saveUserInformation(UserInformationEntity userInformationEntity) {
        entityManager.persist(userInformationEntity);
    }

    @Override
    public List<UserInformation> fetchAllUserInformation() {
        try {
            Query query =
                    entityManager.createNamedQuery("fetchAllUserInformation");


            List<UserInformationEntity> userInformationEntities = query.getResultList();

            return userInformationEntities.stream().map(userInfo -> {
                final UserInformation userInformation = new UserInformation();
                userInformation.setCreatedDate(userInfo.getCreatedDate());
                userInformation.setId(userInfo.getId());
                userInformation.setUsername(userInfo.getUsername());
                return userInformation;
            }).collect(Collectors.toList());
        }catch(Exception e) {
            throw e;
        }
    }


    public List<UserDataInfo> fetchUserInfoData() {
        Query query = entityManager.createNamedQuery("fetchUserDataInfo");

        List<UserDataInfo> users = query.getResultList();

        return users;
    }

}
