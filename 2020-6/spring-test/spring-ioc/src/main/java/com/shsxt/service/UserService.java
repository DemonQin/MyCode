package com.shsxt.service;

import com.shsxt.dao.AccountDao;
import com.shsxt.dao.IRoleDao;
import com.shsxt.dao.UserDao;

public class UserService {


    // 对象的依赖注入
    private UserDao userDao;

    private AccountDao accountDao;

    private AccountService accountService;


    private IRoleDao roleDao;

    private String userName;

    private Integer port;

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRoleDao(IRoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void test(){
        userDao.test();
        accountDao.test();
        accountService.test();
        roleDao.test();
        System.out.println("hello Spring"+","+userName+","+port);
    }
}
