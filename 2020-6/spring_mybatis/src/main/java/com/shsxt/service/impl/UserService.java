package com.shsxt.service.impl;

import com.shsxt.dao.UserDao;
import com.shsxt.vo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }

    public int saveUser(String userName, String userPwd) {
        return userDao.saveUser(userName, userPwd);
    }
}
