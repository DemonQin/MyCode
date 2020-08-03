package org.example;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibIntercepter implements MethodInterceptor {
    Object targe;

    public CGLibIntercepter(Object targe) {
        this.targe = targe;
    }

    public Object getProxy() {
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(targe.getClass());
        enhancer.setCallback(this);
        //返回动态代理
        return enhancer.create();
    }

    public void befor() {
        System.out.println("结婚之前谈个恋爱吧");
    }

    public void after() {
        System.out.println("结婚之后就离婚吧");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        befor();
        //执行目标类方法
        result = methodProxy.invoke(targe, objects);
        after();
        return result;
    }
}
