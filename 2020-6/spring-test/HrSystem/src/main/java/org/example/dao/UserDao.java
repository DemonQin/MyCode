package org.example.dao;

import org.example.po.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {

    private Map<String,User> users;




    public UserDao() {
        users=new HashMap<String,User>();
        users.put("admin",new User(10,"admin","123456"));
    }

    public User queryUserByUserName(String userName) {
        return users.get(userName);
    }
}