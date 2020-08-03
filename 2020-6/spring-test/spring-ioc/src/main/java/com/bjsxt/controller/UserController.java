package com.bjsxt.controller;

import com.bjsxt.service.GoodsService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private GoodsService goodsService;

    public void test(){
        goodsService.test();
        System.out.println("userController.test...");
    }
}
