package com.yegorov.fwlab1.tasks.task21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportManager {

    private final ReportService reportService;

    @Autowired
    public ReportManager(ReportService reportService) {
        this.reportService = reportService;
    }

    public String build(String subject) {
        return reportService.generateReport(subject);
    }
}
