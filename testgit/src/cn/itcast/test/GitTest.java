package cn.itcast.test;

import java.util.Date;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("hello git");
        System.out.println("hello git");
        System.out.println("hello git");
        System.out.println("hello git");
        method();
    }

    public static void method(){
        long time = System.currentTimeMillis();
        Date date = new Date(time);
        System.out.println(date);

    }
}
