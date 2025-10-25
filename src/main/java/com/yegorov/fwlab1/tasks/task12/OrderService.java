package com.yegorov.fwlab1.tasks.task12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentService paymentService;

    @Autowired
    public OrderService(@Qualifier("cardPaymentService") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String placeOrder(double amount) {
        return "Заказ оформлен. " + paymentService.processPayment(amount);
    }
}
