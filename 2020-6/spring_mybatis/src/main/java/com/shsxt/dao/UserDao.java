package com.shsxt.dao;

import com.shsxt.vo.User;

public interface UserDao {
    public User queryUserById(Integer id);

    public int saveUser(String userName,String userPwd);
}
