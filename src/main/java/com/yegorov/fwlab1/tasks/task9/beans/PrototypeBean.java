package com.yegorov.fwlab1.tasks.task9.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
public class PrototypeBean {
    private final String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }
}
