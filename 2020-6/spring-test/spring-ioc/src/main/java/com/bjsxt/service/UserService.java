package com.bjsxt.service;

import com.bjsxt.dao.AccountDao;
import com.bjsxt.dao.IRoleDao;
import com.bjsxt.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * 自动化装配注解
 * 1.@Resource
 *      声明级别:类级别  属性级别  方法级别  常用 属性（推荐） | 方法(Set 方法)
 *      装配规则:
 *          默认按照属性名装配
 *          如果属性名对应的Bean 对象未找到 使用类型(Class 类型)实现装配
 *          如果显式的声明Resource 的name 的value 值 内部装配按照value 执行装配  如果存在该value 对应的对象装配成功 如果不存在装配失败
 *          如果接口存在多个实现时 需要显式的声明name 的value ,根据value 实现装配
 *
 *2.@Autowired
 *     声明级别:常用 属性级别(推荐)  构造器  set
 *     装配规则:
 *        默认按照class 类型执行装配
 *        如果按照名称实现装配  可以配合Qualifier 注解 声明value 值
 *
 *
 *
 */
//@Service
public class UserService {



    @Resource
    private UserDao ud;

  /*  public void setUd(UserDao ud) {
        this.ud = ud;
    }*/

    @Resource(name = "role01")
    private IRoleDao roleDao;


  /*  public void setUd(UserDao ud) {
        this.ud = ud;
    }*/

      @Autowired
      @Qualifier(value = "ad")
      private AccountDao ad;

    public void test(){
        ud.test();
        roleDao.test();
        ad.test();

     /*   Field field=null;
        field.setAccessible(true);
        field.set(new UserService(),new UserDao());*/


        System.out.println("userService.test...");
    }
}
