package com.example.day02;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String process(int id){
        throw new RuntimeException("Underconstruction");
//        return "Result with id = "+id;
    }
}
