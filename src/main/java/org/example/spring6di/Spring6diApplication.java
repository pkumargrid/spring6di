package org.example.spring6di;

import org.example.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6diApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6diApplication.class, args);
        MyController myController = ctx.getBean(MyController.class);
        System.out.println("I am in main method");
        System.out.println(myController.sayHello());
    }

}
