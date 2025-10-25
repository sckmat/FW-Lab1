package com.yegorov.fwlab1.tasks.task20;

import org.springframework.stereotype.Repository;

@Repository
public class ExampleRepository {
    public String fetch() {
        return "data-from-repository";
    }
}
