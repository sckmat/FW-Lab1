package com.yegorov.fwlab1.tasks.task13;

public class GammaBean {

    public GammaBean() {
        System.out.println("GammaBean: constructor called.");
    }

    public void init() {
        System.out.println("GammaBean: custom init method.");
    }

    public void cleanup() {
        System.out.println("GammaBean: custom destroy method.");
    }

    public String doWork() {
        return "GammaBean is working.";
    }
}
