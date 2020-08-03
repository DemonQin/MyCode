package com.shsxt.service;


public class UserService03 {

    private  AccountService03 accountService03;


    public void setAccountService03(AccountService03 accountService03) {
        this.accountService03 = accountService03;
    }

    /* public UserService03(AccountService03 accountService03) {
            this.accountService03 = accountService03;
        }
    */
    public  void test(){
        accountService03.test();
        System.out.println("userService02.test...");
    }
}
