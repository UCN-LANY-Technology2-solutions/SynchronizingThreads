
public class SynchronizedHelloMultipleWorlds extends Thread {

	private int world;

	// we have to use a static object for the mutex here, since we cannot use the
	// class instances
	// because they cannot see each other and therefore is not shared. A static
	// object is.
	private static Object mutex = new Object();

	public SynchronizedHelloMultipleWorlds(int world) {
		this.world = world;
	}

	public void run() {
		synchronized (mutex) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello from world " + world);

				// NOTE! You can put in a delay here, but it really is not necessary
			}
			System.out.println("World " + world + " finished!");
		}
	}
}
