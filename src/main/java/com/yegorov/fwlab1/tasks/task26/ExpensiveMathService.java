package com.yegorov.fwlab1.tasks.task26;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.math.BigInteger;


@Service
public class ExpensiveMathService {


    @Cacheable(cacheNames = "expensive", key = "#n")
    public BigInteger fibonacci(int n) {
        simulateLatency();
        return fib(n);
    }

    private BigInteger fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            BigInteger tmp = a.add(b);
            a = b;
            b = tmp;
        }
        return b;
    }

    private void simulateLatency() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {
        }
    }
}
