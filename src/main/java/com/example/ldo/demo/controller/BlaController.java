package com.example.ldo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bla")
public class BlaController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
