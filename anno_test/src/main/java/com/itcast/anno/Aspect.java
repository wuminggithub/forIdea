package com.itcast.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myAspect")
@org.aspectj.lang.annotation.Aspect
public class Aspect {

    @After("method()")
    public void advice(){
        System.out.println("增强了一些功能");
    }
    @Around("method()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("执行之前");
        Object proceed = pjp.proceed();
        System.out.println("执行之后");
        return proceed;
    }

    @Pointcut("execution(* com.itcast.anno.*.*(..))")
    public void method(){}
}
