package com.yegorov.fwlab1.tasks.task3;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    public String getUser() {
        return "User: Vladislav";
    }
}
