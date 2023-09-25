package com.example.springmockitoprep.service;

import com.example.springmockitoprep.repository.HelloWorldRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloServiceTest {

    @Mock
    private HelloWorldRepository helloWorldRepository;

    @InjectMocks
    private HelloService helloService;

    @Test
    void helloMessageTest() {

        Mockito.when(helloWorldRepository.getHelloWorld()).thenReturn("Mocked Hello World!");

        String result = helloService.helloMessage();

        assertEquals("Mocked Hello World!", result);
    }
}