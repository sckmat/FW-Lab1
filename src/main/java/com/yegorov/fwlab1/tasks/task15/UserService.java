package com.yegorov.fwlab1.tasks.task15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private LoggerService loggerService;

    @Autowired
    public void init(UserRepository userRepository, LoggerService loggerService) {
        this.userRepository = userRepository;
        this.loggerService = loggerService;
        loggerService.log("Dependencies injected via method @Autowired.");
    }

    public void processUser(int id) {
        String user = userRepository.findUserById(id);
        loggerService.log("Processing user: " + user);
    }
}
