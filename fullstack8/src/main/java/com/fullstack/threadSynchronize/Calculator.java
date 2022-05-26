package com.fullstack.threadSynchronize;

public class Calculator {
	
	private int sum;
	
	public synchronized int ArraySum(int[] array) {
		sum = 0;
		
		for(int i=0; i<array.length; i++) {
			
			sum += array[i];
			
			System.out.println("Executing the sum thread current " + Thread.currentThread().getName() +
					"suming the value " + array[i] + "total " + sum);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		return sum;
	}

}
