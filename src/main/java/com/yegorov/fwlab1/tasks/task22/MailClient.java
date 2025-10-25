package com.yegorov.fwlab1.tasks.task22;

public class MailClient {
    private final String fromAddress;

    public MailClient(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String send(String to, String subject, String body) {
        return "Mail[from=" + fromAddress + ", to=" + to + ", subject=" + subject + "] -> " + body;
    }
}
