package com.yegorov.fwlab1.tasks.task13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GammaConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public GammaBean gammaBean() {
        return new GammaBean();
    }
}
