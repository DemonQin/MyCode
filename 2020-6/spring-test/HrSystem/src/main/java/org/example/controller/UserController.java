package org.example.controller;

import org.example.po.ResultInfo;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;


import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    public ResultInfo login(String userName, String userPwd) {
        return userService.login(userName,userPwd);
    }
}
