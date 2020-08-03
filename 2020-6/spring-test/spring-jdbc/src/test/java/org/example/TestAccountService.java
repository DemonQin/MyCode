package org.example;

import org.example.dao.AccountDaoImpl;
import org.example.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccountService {
   AccountService accountService;

    @Before
    public void init() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        accountService = (AccountService) ac.getBean("accountService");
    }

    @Test
    public void test01(){
        accountService.updateAccountInfo(3,4,50);
    }
}
