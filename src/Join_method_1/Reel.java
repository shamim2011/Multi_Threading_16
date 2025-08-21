package Join_method_1;

public class Reel extends Thread{
	public void run() {
		try {
			System.out.println("Reels is started");
			Thread.sleep(3000);
			System.out.println("Reels is happening");
			Thread.sleep(3000);
			System.out.println("Reels is ended");
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
