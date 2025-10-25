package com.yegorov.fwlab1.tasks.task16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactoryDemoService {

    private final Product product;

    @Autowired
    public FactoryDemoService(Product product) {
        this.product = product;
    }

    public void showProductInfo() {
        System.out.println("Created via FactoryBean: " + product);
    }
}
