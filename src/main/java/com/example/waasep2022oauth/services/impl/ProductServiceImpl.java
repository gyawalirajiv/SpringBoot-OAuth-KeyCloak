package com.example.waasep2022oauth.services.impl;

import com.example.waasep2022oauth.repositories.ProductRepository;
import com.example.waasep2022oauth.services.ProductService;
import com.example.waasep2022oauth.models.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
