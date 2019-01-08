package com.tcredit;

/**
 * 该案例演示了守护线程
 */
public class TestDaemonThread {
	public static void main(String[] args) {
		Runnable r = new Processor1();
		//默认情况下,创建的线程对象是用户线程
		Thread t1 = new Thread(r, "t1");
		
		//在启动线程之前,调用线程的setDaemon方法,将用户线程修改为守护线程
		t1.setDaemon(true);
		
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}
		System.out.println("主线程执行结束");
	}
}

class Processor1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}
	}
}
