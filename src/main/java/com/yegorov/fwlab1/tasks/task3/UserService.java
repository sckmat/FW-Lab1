package com.yegorov.fwlab1.tasks.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private UserRepository userRepository;

    public UserService() {
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserInfo() {
        return "UserService → " + userRepository.getUser();
    }
}
