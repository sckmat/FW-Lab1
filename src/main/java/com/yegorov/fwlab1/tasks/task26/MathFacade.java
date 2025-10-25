package com.yegorov.fwlab1.tasks.task26;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigInteger;


@Component
public class MathFacade {

    private final ExpensiveMathService service;

    @Autowired
    public MathFacade(ExpensiveMathService service) {
        this.service = service;
    }

    public BigInteger fib(int n) {
        return service.fibonacci(n);
    }
}
