package com.fullstack.ThreadsResumeSuspendStop;

public class ThreadsResumeSuspendStop implements Runnable {

	private String name;
	private boolean estaSuspensa;
	private boolean foiTerminada;

	public ThreadsResumeSuspendStop(String name) {
		this.name = name;
		this.estaSuspensa = false;
		new Thread(this, name).start();
	}

	@Override
	public void run() {

		System.out.println("Executando " + this.name);

		try {
			for (int i=0; i<10; i++) {
				
				System.out.println("Thread " + name + "," + i);

				Thread.sleep(300);
				
				synchronized (this) {
					while(estaSuspensa) {
						wait();
					}
					
					if(this.foiTerminada) {
						break;
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thread " + this.name + "terminada");
	}
	
	void suspend() {
		this.estaSuspensa = true;
	}
	
	synchronized void resume() {
		this.estaSuspensa = false;
		notify();
	}
	
	synchronized void stop() {
		this.foiTerminada = true;
		notify();
	}

}




























