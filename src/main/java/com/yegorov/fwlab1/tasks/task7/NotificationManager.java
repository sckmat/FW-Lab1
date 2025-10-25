package com.yegorov.fwlab1.tasks.task7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {

    private final NotificationService notificationService;

    @Autowired
    public NotificationManager(@Qualifier("emailService") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public String processNotification() {
        return "Manager" + notificationService.sendNotification();
    }
}
