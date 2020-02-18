package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class AppController {

    @GetMapping("/getdata1")
    public String getData1(){
        return "hello world1";
    }

    @GetMapping("/getdata2")
    public String getData2(){
        return "hello world2";
    }
}
