package org.example;

import org.example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLogAspect {
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.login("admin", "12123");

    }
}
