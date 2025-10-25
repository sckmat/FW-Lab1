package com.yegorov.fwlab1.tasks.task22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportFacade {

    private final ReportBuilder reportBuilder;

    @Autowired
    public ReportFacade(ReportBuilder reportBuilder) {
        this.reportBuilder = reportBuilder;
    }

    public String generate(String payload) {
        return reportBuilder.buildReport(payload);
    }

    public String send(String to, String payload) {
        return reportBuilder.emailReport(to, payload);
    }
}
