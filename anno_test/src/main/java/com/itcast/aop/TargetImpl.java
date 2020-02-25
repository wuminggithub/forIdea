package com.itcast.aop;

public class TargetImpl implements Target {
    public void save() {
        System.out.println("save something ");
    }
}
