package com.yegorov.fwlab1.tasks.task13;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BetaBean implements InitializingBean, DisposableBean {

    public BetaBean() {
        System.out.println("BetaBean: constructor called.");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("BetaBean: InitializingBean.afterPropertiesSet.");
    }

    @Override
    public void destroy() {
        System.out.println("BetaBean: DisposableBean.destroy.");
    }

    public String doWork() {
        return "BetaBean is working.";
    }
}
