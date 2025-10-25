package com.yegorov.fwlab1.tasks.task22;

public class TemplateEngine {
    public String render(String template, String data) {
        return template.replace("{{data}}", data);
    }
}
