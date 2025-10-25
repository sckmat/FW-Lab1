package com.yegorov.fwlab1.tasks.task27;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class AsyncFacade {

    private final NotificationService notificationService;

    @Autowired
    public AsyncFacade(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public CompletableFuture<String> notifyUser(String recipient, String text) {
        return notificationService.sendEmail(recipient, text);
    }
}
