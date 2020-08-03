package com.shsxt.service;

import com.shsxt.dao.AccountDao;
import com.shsxt.dao.IRoleDao;
import com.shsxt.dao.UserDao;

public class UserService02 {
    private UserDao userDao;

    private AccountDao accountDao;

    private IRoleDao roleDao;


    private String userName;




    public UserService02(UserDao userDao, AccountDao accountDao, IRoleDao roleDao, String userName) {
        this.userDao = userDao;
        this.accountDao = accountDao;
        this.roleDao = roleDao;
        this.userName = userName;
    }

    /*  public UserService02(UserDao userDao, AccountDao accountDao, IRoleDao roleDao) {
        this.userDao = userDao;
        this.accountDao = accountDao;
        this.roleDao = roleDao;
    }*/

 /*   public UserService02(UserDao userDao, AccountDao accountDao) {
        this.userDao = userDao;
        this.accountDao = accountDao;
    }*/



    /* public UserService02(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public  void test(){
        userDao.test();
        accountDao.test();
        roleDao.test();
        System.out.println("userService02.test..."+","+userName);
    }
}
