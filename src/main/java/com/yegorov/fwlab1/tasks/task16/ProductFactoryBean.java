package com.yegorov.fwlab1.tasks.task16;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class ProductFactoryBean implements FactoryBean<Product> {

    @Override
    public Product getObject() {
        return new Product("Laptop", 89999.0);
    }

    @Override
    public Class<?> getObjectType() {
        return Product.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
