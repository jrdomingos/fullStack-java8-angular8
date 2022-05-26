package com.fullstack.threadMultiplesRunnable;

public class MultiThreadRunnableTest {

	public static void main(String[] args) {

		MultiThreadRunnable thread1 = new MultiThreadRunnable("#1", 500);
		MultiThreadRunnable thread2 = new MultiThreadRunnable("#2", 700);
		MultiThreadRunnable thread3 = new MultiThreadRunnable("#2", 900);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();

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
