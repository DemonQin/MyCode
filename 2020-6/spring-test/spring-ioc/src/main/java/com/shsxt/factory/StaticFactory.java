package com.shsxt.factory;

import com.shsxt.service.AccountService;

public class StaticFactory {

    public static AccountService getAccountService(){
        return  new AccountService();
    }
}
