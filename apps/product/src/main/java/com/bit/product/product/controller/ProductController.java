package com.bit.product.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.common.MyUser;

@RestController
public class ProductController {

    @GetMapping("/hello")
    public String hello() {
        MyUser myUser = new MyUser("John");
        return  " Hello" + myUser.getName() + "!";
    }
}