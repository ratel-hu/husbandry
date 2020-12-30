package com.husbandry.struggle.controller.husbandry.synchronize;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.locks.ReentrantLock;

/**
 * synchronize 关键字
 * @Author ratelhu
 * @Date 2020/12/30 14:51
 * @Version 1.0
 */
public class Demo implements Runnable {
    //大多数的java程序并发都是错的
    /**
     *
     * 对象布局？
     * 对象头
     * 实例数据
     * 对齐填充
     *
     * java对象头？
     * mark work
     * klass point
     * 对象的状态（锁）
     * 1、无锁
     * 2、偏向锁
     * 3、轻量锁
     * 4、重量所
     * 5、GC标记
     *
     *
     *
     * 数据对齐：方便处理器计算，方便GC回收；
     *
     *
     *
     */


    static int count = 0;
    static LUBANLock lubanLock = new LUBANLock();
    ReentrantLock reentrantLock = new ReentrantLock();


    public static void main(String[] args){

            System.out.println(Integer.toHexString(lubanLock.hashCode()));
        synchronized (lubanLock) {
            System.out.println(ClassLayout.parseInstance(lubanLock).toPrintable());
        }
    }

    @Override
    public void run() {
        synchronized (lubanLock) {
            reentrantLock.lock();
            count++;
        }
    }


}
