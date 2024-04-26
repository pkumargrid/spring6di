package org.example.spring6di.correct.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;


/**
 * Certainly! We can achieve this using the @Primary annotation to indicate which bean should be preferred when multiple beans of the same type are candidates for autowiring.
 * We can also utilize the @Profile annotation to specify which beans should be registered based on the active profile.
 * Additionally, we can use @Order annotation to specify the order in which beans should be considered for autowiring.
 */

@Configuration
public class Config {

    @Bean
    @Profile("dev")
    @Order(2)
    public Test devFoo() {
        return new Test();
    }

    @Bean
    @Profile("prod")
    @Order(1)
    public Test prodFoo() {
        return new Test(1);
    }

    @Bean
    @Primary
    public Test defaultFoo() {
        return new Test(1,2);
    }
}
