package com.example.day02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    private DemoService demoService;
    @Autowired
    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/demo/{id}")
    public DemoResponse xxxx(@PathVariable int id){
        demoService.process(id);
        return new DemoResponse();
    }
}
