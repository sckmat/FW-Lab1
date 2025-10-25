package com.yegorov.fwlab1.tasks.task22;

public class ReportBuilder {
    private final TemplateEngine templateEngine;
    private final MailClient mailClient;

    public ReportBuilder(TemplateEngine templateEngine, MailClient mailClient) {
        this.templateEngine = templateEngine;
        this.mailClient = mailClient;
    }

    public String buildReport(String payload) {
        String rendered = templateEngine.render("Report: {{data}}", payload);
        return rendered;
    }

    public String emailReport(String to, String payload) {
        String report = buildReport(payload);
        return mailClient.send(to, "Monthly Report", report);
    }
}
