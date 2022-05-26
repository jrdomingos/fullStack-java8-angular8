package com.fullstack.thread;

public class MyThreadOne extends Thread {

	private String name;
	private int time;

	public MyThreadOne(String name, int time) {
		this.name = name;
		this.time = time;
		start();

		try

		{
			for (int i = 0; i < 6; i++) {
				System.out.println(name + " contador " + i);
				Thread.sleep(time);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
           System.out.println(name + " terminou a execução #1");
	}

}
