package com.heboshi.bigdata202610.customer.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @RequestMapping(value = "/hello")
    public String hello() {
        System.out.println("hello customer");
        return "success";
    }
}
