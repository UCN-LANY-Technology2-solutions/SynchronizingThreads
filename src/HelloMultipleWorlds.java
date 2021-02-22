
public class HelloMultipleWorlds extends Thread {

	private String world;
	private static Object mutex = new Object();
	private static int lineCounter = 0;

	public HelloMultipleWorlds(String world) {
		this.world = world;
	}

	public void run() {
		synchronized (mutex) {

			for (int i = 0; i < 20; i++) {
				if(lineCounter < 128)
					System.out.println("["+ lineCounter++ +"] Hello from " + world + " world!");
			}

		}
	}
}
