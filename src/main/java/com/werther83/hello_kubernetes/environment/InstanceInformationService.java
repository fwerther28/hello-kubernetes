package com.werther83.hello_kubernetes.environment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InstanceInformationService {

    private static final String HOST_NAME = "HOSTNAME";
    private static final String DEFAULT_ENV_INSTANCE_GUID = "LOCAL";

    @Value("${" + HOST_NAME + ":" + DEFAULT_ENV_INSTANCE_GUID + "}")
    private String hostName;

    public String retrieveInstanceInfo(){
        if (hostName == null || hostName.length() < 5) {
            return hostName != null ? hostName : DEFAULT_ENV_INSTANCE_GUID;
        }
        return hostName.substring(hostName.length() - 5);
    }
}
