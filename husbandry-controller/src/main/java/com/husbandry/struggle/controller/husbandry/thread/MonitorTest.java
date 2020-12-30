package com.husbandry.struggle.controller.husbandry.thread;

/**
 * @Author ratelhu
 * @Date 2020/12/29 14:28
 * @Version 1.0
 */
public class MonitorTest {
    private final static Object lockHelper = new Object();

    public static void main(String[] args){
        System.out.println("hello world");

        synchronized (lockHelper){
            System.out.println("hello world");
        }
    }
}
