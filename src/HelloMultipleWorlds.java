
public class HelloMultipleWorlds extends Thread {

	private String world;
	// we have to use a static object for the mutex here, since we cannot use the class instances 
	// because they cannot see each other and therefore is not shared. A static object is.
	private static Object mutex = new Object();
	// The line counter is also static, so it can be shared across instances of this class
	private static int lineCounter = 0;

	public HelloMultipleWorlds(String world) {
		this.world = world;
	}

	public void run() {
		synchronized (mutex) { 
			for (int i = 0; i < 20; i++) {
				if (lineCounter < 128) { 
					System.out.println("[" + lineCounter++ + "] Hello from " + world + " world!");

					// You can put in a delay here, but it really is not necessary
				}
				else {
					break; // break the loop, when the maximum number of rows is reached
				}
			}
			System.out.println(world + " world finished!");
		}
	}
}
