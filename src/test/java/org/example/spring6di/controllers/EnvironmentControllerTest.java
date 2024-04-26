package org.example.spring6di.controllers;

import org.example.spring6di.services.environment.EnvironmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ActiveProfiles({"prod","ES"})
class EnvironmentControllerTest {

    @Autowired
    private EnvironmentController environmentController;
    @Test
    void getEnv() {
        System.out.println(environmentController.getEnv());
    }
}