package com.example.ldo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boo")
public class BooController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
