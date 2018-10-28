package com.sample.test.TestDemo.dao;

import com.sample.test.TestDemo.Hero;
import com.sample.test.TestDemo.entities.User;
import com.sample.test.TestDemo.entities.UserInformationEntity;
import com.sample.test.TestDemo.model.UserInformation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class JPADaoImpl implements JPADao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Hero hero) {
        entityManager.persist(hero);
    }

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
    }


}
