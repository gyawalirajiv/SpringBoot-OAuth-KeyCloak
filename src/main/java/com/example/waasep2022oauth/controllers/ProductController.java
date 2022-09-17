package com.example.waasep2022oauth.controllers;

import com.example.waasep2022oauth.services.ProductService;
import com.example.waasep2022oauth.models.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }

}
