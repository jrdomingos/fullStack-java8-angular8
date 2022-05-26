package MultiplesThreadRunnable;

public class MultiThreadRunnable implements Runnable {

	private String name;
	private int time;

	public MultiThreadRunnable(String name, int time) {
		this.name = name;
		this.time = time;
		
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

