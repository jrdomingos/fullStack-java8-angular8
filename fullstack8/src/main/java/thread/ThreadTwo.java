package thread;

public class ThreadTwo extends Thread  {
	private String name;
	private int time;

	public ThreadTwo(String name, int time) {
		this.name = name;
		this.time = time;
		start();
	}

	public void run() {

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(name + " contador " + i);
				Thread.sleep(400);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
