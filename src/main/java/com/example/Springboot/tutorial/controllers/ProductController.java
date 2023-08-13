package com.example.Springboot.tutorial.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    @GetMapping("/getAllProducts")
    //this request is: http://localhost:8080/api/v1/Products/getAllProducts
    List<String> getAllProducts() {
        return List.of("iphone", "ipad");
    }
}
