package com.fullstack.runnable;

public class MyTestRunnable {

	public static void main(String[] args) {

		MyThreadRunnable thread1 = new MyThreadRunnable("1#", 500);
		//Thread t1 = new Thread(thread1);
		//t1.start(); //chamei no const da thread
		
		MyThreadRunnable thread2 = new MyThreadRunnable("2#", 700);
		
		MyThreadRunnable thread3 = new MyThreadRunnable("3#", 900);
		
		
	}

}
