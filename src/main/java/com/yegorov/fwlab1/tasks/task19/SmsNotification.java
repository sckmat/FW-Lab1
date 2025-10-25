package com.yegorov.fwlab1.tasks.task19;

import org.springframework.stereotype.Component;

@Component("smsNotification")
public class SmsNotification implements NotificationService {

    @Override
    public String getType() {
        return "sms";
    }

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
