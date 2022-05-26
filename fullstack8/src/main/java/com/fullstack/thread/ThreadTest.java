package com.fullstack.thread;

public class ThreadTest {

	public static void main(String[] args) {

		MyThreadOne thread1 = new MyThreadOne("Thread1 #1", 300);

		ThreadTwo thread2 = new ThreadTwo("ThreadTwo #2", 600);

		ThreadThree Thread3 = new ThreadThree("ThreadThree #3", 900);

	}

}
