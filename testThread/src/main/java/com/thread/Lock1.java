package com.thread;

/**
 * Auther: chong.huo
 * Create  Date: 2019/1/7
 */
public class Lock1 extends Thread {
    Object o1,o2;

    public Lock1(Object o1,Object o2){
        this.o1 =o1;
        this.o2 =o2;

    }
    @Override
    public void run() {
        synchronized (o1){
            System.out.println("111111111");

            try {
                o1.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (o2){
                System.out.println("2222222222");
            }
        }
    }
}
