package com.tcredit;

import com.thread.*;

/**
 * Hello world!
 *
 */
public class Test {
    public static void main1( String[] args ) {

        Thread t1 = new MyThread1();

        Runnable mr1 = new MyRunnable();
        Thread t2 = new Thread(mr1);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();

    }

    public static void main2(String[] args) {

        Runnable runnable = new Processor();
        Thread t1 = new Thread(runnable,"t1");
        Thread t2 = new Thread(runnable,"t2");
        t1.start();
        t2.start();
    }

    public static void main3(String[] args) {
        Runnable  t = new Ticket();
        Thread t1 = new Thread(t,"t1");
        Thread t2 = new Thread(t,"t2");
        Thread t3 = new Thread(t,"t3");

        t1.start();
        t2.start();
        t3.start();
    }

    public static void main4(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new Lock1(o1,o2);
        Thread t2 = new Lock2(o1,o2);
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        Runnable r = new Processor();
        Thread t = new Thread(r,"r");
        t.setDaemon(true);
        t.start();
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+","+i);
        }
        System.out.println("主线程结束");


    }
}
