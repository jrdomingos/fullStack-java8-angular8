package com.fullstack.threadDefiningProperties;

import MultiplesThreadRunnable.MultiThreadRunnable;

public class threadDefiningPropertiesTest {

	public static void main(String[] args) {

		MultiThreadRunnable thread1 = new MultiThreadRunnable("#1", 500);
		MultiThreadRunnable thread2 = new MultiThreadRunnable("#2", 500);
		MultiThreadRunnable thread3 = new MultiThreadRunnable("#2", 500);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();
		
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);
		
	//	t1.setPriority(Thread.NORM_PRIORITY);
		

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Programa finalizado");

	}

}
