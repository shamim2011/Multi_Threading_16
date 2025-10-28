package JoinMethodImpl_02;



public class Instagram {

	public static void main(String[] args) {
		try {
			System.out.println("Instagram is open");
			Chatting ch=new Chatting();
			Reel rl=new Reel();
			Thread t1 = new Thread(ch);
			Thread t2 = new Thread(rl);
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println("Instagram is closed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

