package com.fullstack.synchronize;

public class ThreadSumTest {

	public static void main(String[] args) {
		
		int[]array = {1, 2, 3, 4, 5};
		
		ThreadSum t1 = new ThreadSum("#1", array);
		ThreadSum t2 = new ThreadSum("#2", array); 

	}

}
