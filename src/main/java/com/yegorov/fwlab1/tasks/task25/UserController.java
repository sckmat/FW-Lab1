package com.yegorov.fwlab1.tasks.task25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String displayUser() {
        return "Controller: " + userService.showUser();
    }
}
