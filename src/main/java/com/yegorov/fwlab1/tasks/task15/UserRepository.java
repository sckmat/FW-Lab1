package com.yegorov.fwlab1.tasks.task15;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    public String findUserById(int id) {
        return "User#" + id + " (from repository)";
    }
}
