package com.sample.test.TestDemo;

import com.sample.test.TestDemo.dao.JPADao;
import com.sample.test.TestDemo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WelcomeController {

    @Autowired
    private JPADao jpaDao;

    @GetMapping("/api/heros")
    public List<Hero> getHeros() {
        List<Hero> heros = new ArrayList<>();
        Hero hero = new Hero();
        hero.setId(23);
        hero.setName("Ramu");
        heros.add(hero);

        hero = new Hero();
        hero.setId(24);
        hero.setName("Vasantha");
        heros.add(hero);
        return heros;
    }


    @GetMapping("/api/get")
    public List<User> save() {
        return jpaDao.fetchUserData();

    }

}
