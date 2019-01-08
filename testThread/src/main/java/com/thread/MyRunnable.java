package com.thread;

/**
 * Auther: chong.huo
 * Create  Date: 2019/1/6
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10000;i++) {
            System.out.println("$$$$$$$$$$$$$");
        }
    }
}
