package com.spring.webapp;

import com.spring.webapp.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6CoreApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void contextLoads() {
    }

    @Test
    void testGetControllerFromCtx() {
        MyController myController = applicationContext.getBean(MyController.class);

        System.out.println(myController.sayHello());
    }

    @Test
    void testAutowireOfController() {
        myController.sayHello();
    }

}
