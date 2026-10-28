package com.werther83.hello_kubernetes;

import com.werther83.hello_kubernetes.environment.InstanceInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloKubernetesController {

    @Autowired
    private InstanceInformationService service;

    @GetMapping(path = "/")
    public String imUpAndRunning() {
        return "{health:true}";
    }

    @GetMapping(path = "/hello-kubernetes")
    public String helloKubernetes() {
        return "Hello Kubernetes V2 " + service.retrieveInstanceInfo() + " | Built by Francisco Werther";
    }
}
