package org.example;

import org.example.dao.Account;
import org.example.dao.AccountDaoImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestDao {
    AccountDaoImpl accountDaoImpl;

    @Before
    public void init() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        accountDaoImpl = (AccountDaoImpl) ac.getBean("accountDaoImpl");
    }

    @Test
    public void Test01() {

        Account account = new Account("jiangjie", "1", "第一个对象", new Date(), new Date(), 1000l, 13);

        System.out.println(accountDaoImpl.addAccountNoKey(account));
    }

    @Test
    public void Test02() {

        Account account = new Account("jiangjie", "1", "第一个对象", new Date(), new Date(), 1000l, 13);

        System.out.println(accountDaoImpl.addAccountHasKey(account));
    }

    @Test
    public void Test03() {
        List<Account> accounts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            accounts.add(new Account("jiangjie" + i, i + "", "第" + i + "个对象", new Date(), new Date(), 1000l, i));
        }
        System.out.println(accountDaoImpl.addAccountBatch(accounts));
    }

    @Test
    public void Test04() {
        System.out.println(accountDaoImpl.queryAccountCount(3));
    }

    @Test
    public void Test05() {
        System.out.println(accountDaoImpl.queryAccountsByParams(null, "", "", "",2,10));
    }

    @Test
    public void Test06() {
        System.out.println(accountDaoImpl.queryAccountsByParams(2, "", "", ""));
    }
}
