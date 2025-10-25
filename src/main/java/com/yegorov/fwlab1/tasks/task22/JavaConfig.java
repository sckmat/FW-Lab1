package com.yegorov.fwlab1.tasks.task22;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public TemplateEngine templateEngine() {
        return new TemplateEngine();
    }

    @Bean
    public MailClient mailClient(@Value("${mail.from:noreply@example.com}") String from) {
        return new MailClient(from);
    }

    @Bean
    public ReportBuilder reportBuilder(TemplateEngine templateEngine, MailClient mailClient) {
        return new ReportBuilder(templateEngine, mailClient);
    }
}
