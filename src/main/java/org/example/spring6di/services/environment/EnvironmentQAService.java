package org.example.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class EnvironmentQAService implements EnvironmentService{

    @Override
    public String getEnvironment() {
        return "qa";
    }
}
