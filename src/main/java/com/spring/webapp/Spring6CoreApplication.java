package com.spring.webapp;

import com.spring.webapp.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6CoreApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Spring6CoreApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In main method");

        System.out.println(controller.sayHello());
    }

}
