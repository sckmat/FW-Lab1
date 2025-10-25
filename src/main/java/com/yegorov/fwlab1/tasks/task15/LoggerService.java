package com.yegorov.fwlab1.tasks.task15;

import org.springframework.stereotype.Component;

@Component
public class LoggerService {
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
