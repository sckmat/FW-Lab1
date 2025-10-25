package com.yegorov.fwlab1.tasks.task24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


@Service
public class BetaService {

    private AlphaService alphaService;

    public String actionFromBeta() {
        return "Beta -> " + alphaService.name();
    }

    @Autowired
    public void setAlphaService(@Lazy AlphaService alphaService) {
        this.alphaService = alphaService;
    }

    public String name() {
        return "BetaService";
    }
}
