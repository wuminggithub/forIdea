package com.itcast.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class TargetImpl implements Target {
    public void save() {
        System.out.println("save something ");
    }


}
