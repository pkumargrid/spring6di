package org.example.spring6di.controllers;

import org.example.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class Myi18NController {
    private final GreetingService greetingService;

    public Myi18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
