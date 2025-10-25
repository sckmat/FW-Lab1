package com.yegorov.fwlab1.tasks.task24;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
public class BetaAltService {

    private final ObjectProvider<AlphaAltService> alphaProvider;

    public BetaAltService(ObjectProvider<AlphaAltService> alphaProvider) {
        this.alphaProvider = alphaProvider;
    }

    public String action() {
        return "BetaAlt -> " + alphaProvider.getObject().name();
    }

    public String name() {
        return "BetaAltService";
    }
}
