package com.yegorov.fwlab1.tasks.task12;

import org.springframework.stereotype.Component;

@Component("cardPaymentService")
public class CardPaymentService implements PaymentService {

    @Override
    public String processPayment(double amount) {
        return "Оплата картой на сумму " + amount + "₽ успешно выполнена.";
    }
}
