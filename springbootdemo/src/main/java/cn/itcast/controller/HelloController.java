package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {
    @Autowired
    private DataSource dataSource;
    @GetMapping("/hello")
    public String hello(){
        System.out.println("datasource121::"+dataSource);
        for (int i = 0; i < 8; i++) {
            System.out.println(i);
        }
        return "hello spring boot423";
    }
}
