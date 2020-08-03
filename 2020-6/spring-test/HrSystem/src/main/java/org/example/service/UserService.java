package org.example.service;

import org.apache.commons.lang.StringUtils;
import org.example.dao.UserDao;
import org.example.po.ResultInfo;
import org.example.po.User;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;





@Service
public class UserService {

    @Resource
    private UserDao userDao;
    public ResultInfo login(String userName, String userPwd) {
        System.out.println("liufuning");
        /**
         * 1.参数校验
         *    用户名  密码  非空
         * 2.根据用户名查询用户记录
         *
         * 3.判断记录是否存在
         *    存在
         *       比对密码
         *           true  登录成功
         *           false  密码不正确
         *    不存在   用户不存在
         */
        ResultInfo resultInfo=new ResultInfo();
        if(StringUtils.isBlank(userName)){
            resultInfo.setCode(500);
            resultInfo.setMsg("用户名不能为空!");
            return resultInfo;
        }
        if(StringUtils.isBlank(userPwd)){
            resultInfo.setCode(500);
            resultInfo.setMsg("用户密码不能为空!");
            return resultInfo;
        }

        User user = userDao.queryUserByUserName(userName);

        if(null == user){
            resultInfo.setCode(500);
            resultInfo.setMsg("用户记录不存在!");
            return resultInfo;
        }

        if(!(userPwd.equals(user.getUserPwd()))){
            resultInfo.setCode(500);
            resultInfo.setMsg("用户密码不正确!");
            return resultInfo;
        }
        resultInfo.setMsg("用户登录成功!");
        resultInfo.setResult(user);
        return resultInfo;
    }
}
