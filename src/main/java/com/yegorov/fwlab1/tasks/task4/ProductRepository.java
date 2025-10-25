package com.yegorov.fwlab1.tasks.task4;

import org.springframework.stereotype.Component;

@Component
public class ProductRepository {
    public String getProductName() {
        return "Product: Spring Boot Course";
    }
}
