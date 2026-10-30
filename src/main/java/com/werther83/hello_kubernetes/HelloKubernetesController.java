package com.werther83.hello_kubernetes;

import com.werther83.hello_kubernetes.environment.InstanceInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> helloKubernetes() {
        String message = "Hello Kubernetes V2 " + service.retrieveInstanceInfo() + " | Built by Francisco Werther";

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.CONNECTION, "close");

        return ResponseEntity.ok()
                .headers(headers)
                .body(message);
    }
}