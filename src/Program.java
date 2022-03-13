public class Program {

	public static void main(String[] args) {
		
		// This program creates ten threads by instantiating ten instances of the HelloMultipleWorlds class		
		HelloMultipleWorlds world1 = new HelloMultipleWorlds("first");
		HelloMultipleWorlds world2 = new HelloMultipleWorlds("second");
		HelloMultipleWorlds world3 = new HelloMultipleWorlds("third");
		HelloMultipleWorlds world4 = new HelloMultipleWorlds("fouth");
		HelloMultipleWorlds world5 = new HelloMultipleWorlds("fifth");
		HelloMultipleWorlds world6 = new HelloMultipleWorlds("sixth");
		HelloMultipleWorlds world7 = new HelloMultipleWorlds("seventh");
		HelloMultipleWorlds world8 = new HelloMultipleWorlds("eighth");
		HelloMultipleWorlds world9 = new HelloMultipleWorlds("ninth");
		HelloMultipleWorlds world10 = new HelloMultipleWorlds("tenth");

		world1.start();
		world2.start();
		world3.start();
		world4.start();
		world5.start();
		world6.start();
		world7.start();
		world8.start();
		world9.start();
		world10.start();
		
		System.out.println("All worlds started");
	}

}
