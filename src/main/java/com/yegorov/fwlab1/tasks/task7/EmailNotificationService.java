package com.yegorov.fwlab1.tasks.task7;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailNotificationService implements NotificationService {

    @Override
    public String sendNotification() {
        return "Sending email notification...";
    }
}
