package org.example.spring6di.services.i18n;

import org.example.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18NService")
@Profile({"EN","default"})
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello English -EN";
    }
}
