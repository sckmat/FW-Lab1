package com.yegorov.fwlab1.tasks.task17;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevEnvInfoService implements EnvInfoService {

    @Value("${app.name:FWLab App}")
    private String appName;

    @Value("${app.debug:true}")
    private boolean debug;

    @Override
    public String getInfo() {
        return "DEV profile: appName=" + appName + ", debug=" + debug;
    }
}
