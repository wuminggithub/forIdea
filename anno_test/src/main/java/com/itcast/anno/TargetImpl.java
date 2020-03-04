package com.itcast.anno;

import org.springframework.stereotype.Component;

@Component("target")
public class TargetImpl implements Target {
    public void save() {
        System.out.println("save something ");
    }


}
