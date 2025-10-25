package com.yegorov.fwlab1.tasks.task7;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsNotificationService implements NotificationService {

    @Override
    public String sendNotification() {
        return "Sending SMS notification...";
    }
}
