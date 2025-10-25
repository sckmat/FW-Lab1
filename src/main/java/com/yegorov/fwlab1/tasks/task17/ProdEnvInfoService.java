package com.yegorov.fwlab1.tasks.task17;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdEnvInfoService implements EnvInfoService {

    @Value("${app.name:FWLab App}")
    private String appName;

    @Value("${app.debug:false}")
    private boolean debug;

    @Override
    public String getInfo() {
        return "PROD profile: appName=" + appName + ", debug=" + debug;
    }
}
