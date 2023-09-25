package com.example.springmockitoprep.repository;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldRepositoryImpl implements HelloWorldRepository {
    @Override
    public String getHelloWorld(){
        return "Hello World!";
    }
}
