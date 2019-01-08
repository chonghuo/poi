package com.thread;

/**
 * Auther: chong.huo
 * Create  Date: 2019/1/7
 */
public class Lock2 extends Thread{


    Object o1,o2;

    public Lock2(Object o1,Object o2){
          this.o1 =o1;
          this.o2 =o2;

    }

    @Override
    public void run() {
        synchronized (o2){
            System.out.println("3333333333");
            synchronized (o1){
                System.out.println("4444444444");
                o1.notifyAll();
            }
        }

    }
}
