package org.example.spring6di;

import org.example.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6diApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private MyController myController;

    @Test
    void testGetControllerFromCtx() {
        MyController controller = applicationContext.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }

    @Test
    void testAutowireOfController() {
        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
