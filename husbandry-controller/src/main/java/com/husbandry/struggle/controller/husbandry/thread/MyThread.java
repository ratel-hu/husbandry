package com.husbandry.struggle.controller.husbandry.thread;

import lombok.Data;
import org.openjdk.jol.info.ClassLayout;

import static sun.misc.Version.print;

/**
 * @Author ratelhu
 * @Date 2020/12/29 10:26
 * @Version 1.0
 */
public class MyThread implements Runnable {
    static int num = 0;
    public static final Object lockHelper = new Object();
    public void add(){
        synchronized(lockHelper) {
            for (int i = 0; i < 10000; i++) {
                num++;
            }

        }
    }
    @Override
    public void run() {
        add();
    }
    public static void main(String[] args) throws InterruptedException {

        //多线程
//        MyThread mt = new MyThread();
//        Thread read1 = new Thread(new MyThread());
//        Thread read2 = new Thread(new MyThread());
//        read1.start();
//        read2.start();
//        read1.join();
//        read2.join();
//        System.out.println(num);
        Object obj = new Object();
        /* 查看内部信息 */
       // System.out.println(ClassLayout.parseInstance(obj).toPrintable());
//        synchronized (obj){
//            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
//        }


    }
}
