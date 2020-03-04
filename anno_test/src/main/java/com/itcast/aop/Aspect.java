package com.itcast.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aspect {

    public void advice(){
        System.out.println("增强了一些功能");
    }
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("执行之前");
        Object proceed = pjp.proceed();
        System.out.println("执行之后");
        return proceed;
    }
}
