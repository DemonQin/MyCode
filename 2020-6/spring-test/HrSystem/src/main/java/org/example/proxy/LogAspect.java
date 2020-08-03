package org.example.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* org.example..UserService.*(..))")
    public void cut() {
    }

    @Before(value = "cut()")
    public void befor() {
        System.out.println("前置通知-->目标方法执行前执行该方法");
    }

    @After(value = "cut()")
    public void after() {
        System.out.println("后置通知");
    }



    @Around(value = "cut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前置...");
        System.out.println("环绕通知");
        System.out.println(pjp.getTarget() + "--" + pjp.getSignature());
        Object result = pjp.proceed();
        System.out.println("环绕后置...");
        return result;
    }

}
