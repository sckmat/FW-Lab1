package com.yegorov.fwlab1.tasks.task12;

import org.springframework.stereotype.Component;

@Component("cashPaymentService")
public class CashPaymentService implements PaymentService {

    @Override
    public String processPayment(double amount) {
        return "Оплата наличными на сумму " + amount + "₽ принята.";
    }
}
