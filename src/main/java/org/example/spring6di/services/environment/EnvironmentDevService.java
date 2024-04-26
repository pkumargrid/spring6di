package org.example.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev","default"})
public class EnvironmentDevService implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "dev";
    }
}
