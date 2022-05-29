package com.fullstack.threadSemaphoreSimulator;

public class ThreadSemaphore implements Runnable {

	private ColorSemaphore color;
	private boolean stop;

	public ThreadSemaphore() {
		this.color = ColorSemaphore.RED;

		this.stop = false;

		new Thread(this).start();

	}

	@Override
	public void run() {

		while (!stop) {
			try {
				switch (this.color) {
				case RED:
					Thread.sleep(5000);
					break;
					
				case YELLOW:
					Thread.sleep(2000);
					break;
					
				case GREEN:
					Thread.sleep(5000);
					break;

				default:
					break;
				}
				
				this.changeColor();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	private synchronized void changeColor() {
		switch (this.color) {
		case RED:
			this.color = ColorSemaphore.GREEN;
			break;
			
		case YELLOW:
			this.color = ColorSemaphore.RED;
			break;
			
		case GREEN:
			this.color = ColorSemaphore.YELLOW;
			break;

		default:
			break;
		}		
		
	}
	
	public synchronized void turnOffSemaphore() {
		this.stop = true;
	}

	public ColorSemaphore getColor() {
		return color;
	}	

}































