package com.sample.test.TestDemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import org.springframework.util.LinkedMultiValueMap;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations = "classpath:application.properties")
@WebMvcTest(WelcomeController.class)
public class TestDemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void fetchUsersList() throws Exception{
        LinkedMultiValueMap<String,String> requestparams
                = new LinkedMultiValueMap<>();

        String response = this.mockMvc
                .perform(get("/api/get"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().is5xxServerError())
                .andReturn().getResponse().getContentAsString();

        Assert.assertNotNull(response);
    }
}
