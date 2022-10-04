
public class HelloMultipleWorlds extends Thread {

	private int world;

	public HelloMultipleWorlds(int world) {
		this.world = world;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello from world " + world);

			// NOTE! You can put in a delay here, but it really is not necessary
		}
		System.out.println("World " + world + " finished!");
	}
}
