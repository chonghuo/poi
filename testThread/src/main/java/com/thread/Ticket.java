package com.thread;

/**
 * Auther: chong.huo
 * Create  Date: 2019/1/7
 */
public class Ticket implements Runnable {
    int num =1000;

    @Override
    public void run() {
        for (int i= 0 ;i<1000;i++){
            synchronized (this){
                if(num>0){
                    System.out.println(Thread.currentThread().getName()+"开始出票");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"出票成功，还剩"+ --num + "张票");
                }

            }
        }
    }
}
