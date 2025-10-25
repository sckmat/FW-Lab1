package com.yegorov.fwlab1.tasks.task10;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {

    public LifecycleBean() {
        System.out.println("Конструктор: бин LifecycleBean создан (но ещё не инициализирован).");
    }

    @PostConstruct
    public void onInit() {
        System.out.println("@PostConstruct: бин инициализирован и готов к использованию.");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("@PreDestroy: бин будет уничтожен перед завершением работы контекста Spring.");
    }

    public void doSomething() {
        System.out.println("Метод doSomething() вызван — бин работает.");
    }
}
