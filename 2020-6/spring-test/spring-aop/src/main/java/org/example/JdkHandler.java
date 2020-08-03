package org.example;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 定义产生动态代理类的JdkHandler类
 */
public class JdkHandler implements InvocationHandler {
    public Object targe;

    public JdkHandler(Object targe) {
        //定义目标类
        this.targe = targe;
    }

    /**
     * 返回动态代理类
     *
     * @return
     */
    public Object getProxy() {
        /**
         * 参数
         *  1、类加载器
         *  2、目标类实现的所有接口的数组 class[]
         *  3、实现InvocationHandler接口的类
         */
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), targe.getClass().getInterfaces(), this);
    }

    public void befor() {
        System.out.println("结婚之前谈个恋爱吧");
    }

    public void after() {
        System.out.println("结婚之后就离婚吧");
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        befor();
        result = method.invoke(targe, args);
        after();
        return result;

    }
}
