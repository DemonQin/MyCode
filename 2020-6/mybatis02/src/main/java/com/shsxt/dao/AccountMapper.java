package com.shsxt.dao;

import com.shsxt.vo.Account;
import org.apache.ibatis.annotations.Delete;

public interface AccountMapper {
    public Account queryAccountByid(int id);

    public int saveAccount(Account account);

    @Delete("delete from account where id=#{id}")
    public  int deleteAccountById(int id);

    public int deleteAll();
}
