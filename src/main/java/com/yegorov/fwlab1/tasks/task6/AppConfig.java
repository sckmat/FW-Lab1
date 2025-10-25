package com.yegorov.fwlab1.tasks.task6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DatabaseService databaseService() {
        return new DatabaseService();
    }
}
