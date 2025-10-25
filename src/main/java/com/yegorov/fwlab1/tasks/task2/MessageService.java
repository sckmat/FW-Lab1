package com.yegorov.fwlab1.tasks.task2;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    public String getMessage() {
        return "Hello from MessageService!";
    }
}
