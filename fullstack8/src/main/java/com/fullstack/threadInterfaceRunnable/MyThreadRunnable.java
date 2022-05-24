package com.fullstack.threadInterfaceRunnable;

 public class MyThreadRunnable implements Runnable {

	private String name;
	private int time;

	public MyThreadRunnable(String name, int time) {
		this.name = name;
		this.time = time;
		Thread t1 = new Thread(this);
		t1.start();
	}

	@Override
	public void run() {
		try {

			for (int i = 0; i < 6; i++) {
				System.out.println(name + " contador " + i);

				Thread.sleep(time);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println(name + " terminou a execução ");

	}

}
