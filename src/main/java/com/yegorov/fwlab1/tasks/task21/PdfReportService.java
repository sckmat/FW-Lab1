package com.yegorov.fwlab1.tasks.task21;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PdfReportService implements ReportService {

    @Override
    public String generateReport(String subject) {
        return "PDF Report: " + subject;
    }
}
