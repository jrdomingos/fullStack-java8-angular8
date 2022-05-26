package com.fullstack.synchronize;

public class ThreadSum implements Runnable{
	
	private String name;
	private int[]numbers;
	private static Calculator calc = new Calculator();
	
	public ThreadSum(String name, int[]numbers) {
		this.name =  name;
		this.numbers = numbers;
		new Thread(this, name).start();
	}
	
	
	
	@Override
	public void run() {
		
		System.out.println(this.name + "iniciada");
		

		int sum = calc.ArraySum(this.numbers);
		
		System.out.println("Resultado da soma para thread" + this.name + " é: " + sum);
		
		System.out.println(this.name + " terminada ");
		
	}

}
