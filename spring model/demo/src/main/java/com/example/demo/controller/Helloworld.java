package com.example.demo.controller;

import com.example.demo.model.InOb;
import com.example.demo.model.OutputOb;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class Helloworld {
    @GetMapping("/out")
    public OutputOb output(){
        OutputOb out = new OutputOb("This is a message", 123456789);
        return out;
    }

    @PostMapping("/in")
    public InOb input(@RequestBody InOb inOb){
        return inOb;
    }

    @GetMapping("/query/{dummy}")
    public String query(@PathVariable("dummy") String dummy){
        return dummy;
    }
}
