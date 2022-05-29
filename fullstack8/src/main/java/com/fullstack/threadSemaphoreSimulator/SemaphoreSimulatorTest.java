package com.fullstack.threadSemaphoreSimulator;

public class SemaphoreSimulatorTest {

	public static void main(String[] args) {

		ThreadSemaphore semaphore = new ThreadSemaphore();
		
		for(int i=0; i<10; i++) {
			System.out.println(semaphore.getColor());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		semaphore.turnOffSemaphore();
		
	}

}
