package com.yegorov.fwlab1.tasks.task27;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;


@Service
public class NotificationService {

    @Async
    public CompletableFuture<String> sendEmail(String recipient, String message) {
        try {
            System.out.println("[Async] Sending email to " + recipient + "...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return CompletableFuture.completedFuture("Error sending email to " + recipient);
        }
        return CompletableFuture.completedFuture("Email sent to " + recipient + ": " + message);
    }
}
