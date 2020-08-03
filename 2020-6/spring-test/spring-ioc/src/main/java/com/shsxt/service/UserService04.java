package com.shsxt.service;


public class UserService04 {

    private AccountService accountService;

    private GoodsService goodsService;


    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public  void test(){
        accountService.test();
        goodsService.test();
        System.out.println("userService02.test...");
    }
}
