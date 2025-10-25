package com.yegorov.fwlab1.tasks.task1;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String sayHello() {
        return "Hello, Spring!";
    }
}
