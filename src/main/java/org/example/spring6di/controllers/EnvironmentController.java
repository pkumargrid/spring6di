package org.example.spring6di.controllers;

import org.example.spring6di.services.environment.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;


    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnv() {
        return environmentService.getEnvironment();
    }
}
