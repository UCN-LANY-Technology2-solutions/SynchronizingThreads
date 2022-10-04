public class Program {

	public static void main(String[] args) {

		// This program creates ten threads by instantiating ten instances of the
		// Thread derivated class and starts them		
		for (int i = 1; i <= 10; i++) {
//			new HelloMultipleWorlds(i).start();
//			new SynchronizedHelloMultipleWorlds(i).start();
			new SynchronizedHelloMultipleWorldsWithLineCounter(i).start();
		}

		System.out.println("All worlds started");
	}

}
