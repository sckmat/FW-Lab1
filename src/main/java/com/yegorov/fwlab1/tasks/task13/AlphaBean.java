package com.yegorov.fwlab1.tasks.task13;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class AlphaBean {

    public AlphaBean() {
        System.out.println("AlphaBean: constructor called.");
    }

    @PostConstruct
    public void init() {
        System.out.println("AlphaBean: @PostConstruct init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("AlphaBean: @PreDestroy destroy.");
    }

    public String doWork() {
        return "AlphaBean is working.";
    }
}
