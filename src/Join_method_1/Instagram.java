package Join_method_1;

public class Instagram {

	public static void main(String[] args) {
		try {
			System.out.println("Instagram is open");
			Chatting ch=new Chatting();
			Reel rl=new Reel();
			ch.start();
			rl.start();
			ch.join();
			rl.join();
			System.out.println("Instagram is closed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
