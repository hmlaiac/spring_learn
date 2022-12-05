package com.example.demo.controller;

import com.example.demo.model.OutputOb;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Helloworld {
    @GetMapping("/out")
    public OutputOb output(){
        OutputOb out = new OutputOb("This is a message", 123456789);
        return out;
    }
}
