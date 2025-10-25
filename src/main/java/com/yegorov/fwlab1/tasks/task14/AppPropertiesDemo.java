package com.yegorov.fwlab1.tasks.task14;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppPropertiesDemo {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.author}")
    private String author;

    public void printInfo() {
        System.out.println("Application name: " + appName);
        System.out.println("Version: " + appVersion);
        System.out.println("Author: " + author);
    }
}
