package com.yegorov.fwlab1.tasks.task20;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    private final ExampleRepository repository;

    @Autowired
    public ExampleService(ExampleRepository repository) {
        this.repository = repository;
    }

    public String process() {
        return "processed-" + repository.fetch();
    }
}
