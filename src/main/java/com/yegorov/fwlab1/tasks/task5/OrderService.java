package com.yegorov.fwlab1.tasks.task5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String getOrderInfo() {
        return "OrderService → " + orderRepository.getOrderDetails();
    }
}
