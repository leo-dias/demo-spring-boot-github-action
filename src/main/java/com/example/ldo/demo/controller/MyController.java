package com.example.ldo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my")
public class MyController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return "hello2";
    }

    @RequestMapping("/hello3")
    public String hello3() {
        return "hello3";
    }

    @RequestMapping("/hello4")
    public String hello4() {
        return "hello4";
    }
}
