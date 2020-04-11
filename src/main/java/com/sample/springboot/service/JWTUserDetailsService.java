package com.sample.springboot.service;

import com.sample.springboot.entities.User;
import com.sample.springboot.dao.JPADao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jwtUserDetailsService")
public class JWTUserDetailsService implements UserDetailsService {

    @Autowired
    private JPADao jpaDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        List<User> users = jpaDao.fetchUserData(username);
        if (users != null && users.size() > 0) {
            return JWTUserFactory.create(users.get(0));
        } else {
            //log the Exception
        }
        return null;
    }
}
