package JoinMethodImpl_02;

public class Chatting implements Runnable{
	public void run() {
		try {
			System.out.println("Chatting is started");
			Thread.sleep(3000);
			System.out.println("Chatting is happening");
			Thread.sleep(3000);
			System.out.println("Chatting is ended");
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}