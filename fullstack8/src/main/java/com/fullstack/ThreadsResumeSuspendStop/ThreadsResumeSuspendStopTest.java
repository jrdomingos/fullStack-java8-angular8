package com.fullstack.ThreadsResumeSuspendStop;

public class ThreadsResumeSuspendStopTest {

	public static void main(String[] args) {

		ThreadsResumeSuspendStop t1 = new ThreadsResumeSuspendStop("#1");
		ThreadsResumeSuspendStop t2 = new ThreadsResumeSuspendStop("#2");
		
		System.out.println("Pausando a thread #1");
		
		t1.suspend();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Pausando a thread #2");
		
		t2.suspend();
		
		System.out.println("Resumindo a thread #1");
		
		t1.resume();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Resumindo a thread #2");
		
		
		t2.resume();
		
		System.out.println("Terminando a thread #2");
		
		t2.stop();

	}

}
