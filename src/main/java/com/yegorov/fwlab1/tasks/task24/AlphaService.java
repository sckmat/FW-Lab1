package com.yegorov.fwlab1.tasks.task24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


@Service
public class AlphaService {

    private BetaService betaService;

    public String actionFromAlpha() {
        return "Alpha -> " + betaService.name();
    }

    @Autowired
    public void setBetaService(@Lazy BetaService betaService) {
        this.betaService = betaService;
    }

    public String name() {
        return "AlphaService";
    }
}
