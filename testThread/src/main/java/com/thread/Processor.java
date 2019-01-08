package com.thread;

/**
 * Auther: chong.huo
 * Create  Date: 2019/1/6
 */
public class Processor implements Runnable {
    int s = 0;


    @Override
    public void run() {

//                int s =0;
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
//                s += i;
                System.out.println(Thread.currentThread().getName() + ", i=" + i);
            }
//            s =0;
        }

    }
}
