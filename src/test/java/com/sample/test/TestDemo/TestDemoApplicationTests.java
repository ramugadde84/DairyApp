package com.sample.test.TestDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemoApplicationTests {

	@Test
	public void checkUserData() {
		System.out.println("test");


	}

}
