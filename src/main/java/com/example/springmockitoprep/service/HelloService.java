package com.example.springmockitoprep.service;

import com.example.springmockitoprep.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    HelloWorldRepository helloWorldRepository;

    public String helloMessage(){
        return helloWorldRepository.getHelloWorld(); //+":-)";
    }
}

