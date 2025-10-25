package com.yegorov.fwlab1.tasks.task21;

import org.springframework.stereotype.Service;

@Service
public class HtmlReportService implements ReportService {

    @Override
    public String generateReport(String subject) {
        return "<html><body><h1>HTML Report</h1><p>" + subject + "</p></body></html>";
    }
}
