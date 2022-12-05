package com.example.product_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/")
    public String home()
    {
        return  "WELCOME!!!!!!!!!!!!!";
    }

    @PostMapping("/add")
    public String add()
    {
        return  "ADD PRODUCT DETAILS";
    }
}
