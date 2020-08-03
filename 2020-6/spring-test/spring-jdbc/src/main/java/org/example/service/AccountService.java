package org.example.service;


import org.example.dao.AccountDao;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountService implements IAccountService {
    @Resource
    private AccountDao accountDao;


    @Override
    public int updateAccountInfo(Integer sourceAId, Integer targeAId, double money) {
        int result = 0;

        int i = accountDao.outAccount(sourceAId, money);
        int i1 = accountDao.inAccount(targeAId, money);
        if (i == 1 && i1 == 1) {
            System.out.println("转账成功");
            result = 1;
        }
        return result;
    }
}


