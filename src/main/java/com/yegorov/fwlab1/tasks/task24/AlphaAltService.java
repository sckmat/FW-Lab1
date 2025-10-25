package com.yegorov.fwlab1.tasks.task24;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;


@Service
public class AlphaAltService {

    private final ObjectProvider<BetaAltService> betaProvider;

    public AlphaAltService(ObjectProvider<BetaAltService> betaProvider) {
        this.betaProvider = betaProvider;
    }

    public String action() {
        return "AlphaAlt -> " + betaProvider.getObject().name();
    }

    public String name() {
        return "AlphaAltService";
    }
}
