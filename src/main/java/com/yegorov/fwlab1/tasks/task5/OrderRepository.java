package com.yegorov.fwlab1.tasks.task5;

import org.springframework.stereotype.Component;

@Component
public class OrderRepository {
    public String getOrderDetails() {
        return "Order #12345: 2 items, total 1999₽";
    }
}
