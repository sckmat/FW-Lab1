package com.yegorov.fwlab1.tasks.task4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public String getProductInfo() {
        return "ProductService → " + productRepository.getProductName();
    }
}
