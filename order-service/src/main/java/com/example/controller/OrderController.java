package com.example.controller;


import com.example.client.ProductClient;
import com.example.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/product/{productId}")
    public ProductDto getOrderProduct(@PathVariable Long productId) {
        return productClient.getProductById(productId);
    }
}