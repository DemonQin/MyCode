package org.example;

import org.example.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test01() {
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("spring.xml");
        UserController userController1= (UserController) ac.getBean("userController");
        System.out.println(userController1.login("admin", "12123"));

    }
}
