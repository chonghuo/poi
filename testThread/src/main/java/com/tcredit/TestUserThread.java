package com.tcredit;

/**
 * 该案例演示了用户线程
 */
public class TestUserThread {
	public static void main(String[] args) {
		Runnable r = new Processor2();
		Thread t1 = new Thread(r, "t1");
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}
		System.out.println("主线程执行结束");
	}
}

class Processor2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "--->" + i);
		}
	}
}