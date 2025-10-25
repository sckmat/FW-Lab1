package com.yegorov.fwlab1.tasks.task19;

import org.springframework.stereotype.Component;

@Component("emailNotification")
public class EmailNotification implements NotificationService {

    @Override
    public String getType() {
        return "email";
    }

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
