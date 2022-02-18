package com.example.day02;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import org.springframework.boot.test.context.SpringBootTest.*;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private DemoService demoService;


    @Test
    void case01(){
        //Arrange
        //create stub
        when(demoService.process(100)).thenReturn("xyz");

        //Act :: call api
        DemoResponse result = restTemplate.getForObject("/demo/100", DemoResponse.class);

        //Assert :: Verify
        assertEquals(100,result.getCode());
        assertEquals("Result with id = 100",result.getMessage());
    }
}