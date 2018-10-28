package com.sample.test.TestDemo.webservices;

import com.sample.test.TestDemo.Hero;
import com.sample.test.TestDemo.dao.JPADao;
import com.sample.test.TestDemo.entities.User;
import com.sample.test.TestDemo.entities.UserInformationEntity;
import com.sample.test.TestDemo.model.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserSaveFacade {

    @Autowired
    private JPADao jpaDao;

    @GetMapping("/api/userinfo/list")
    public List<UserInformation> getHeros() {
        return jpaDao.fetchAllUserInformation();
    }


    @RequestMapping(value = "/api/userinfo/save", method = RequestMethod.POST)
    public @ResponseBody  UserInformation save(@RequestBody  UserInformation userInformation) {
        UserInformationEntity userInformationEntity = new UserInformationEntity();
        userInformationEntity.setUsername(userInformation.getUsername());
        userInformationEntity.setCreatedDate(new Date());
        jpaDao.saveUserInformation(userInformationEntity);
        userInformation.setId(userInformationEntity.getId());
        userInformation.setCreatedDate(userInformationEntity.getCreatedDate());
        return userInformation;
    }
}
