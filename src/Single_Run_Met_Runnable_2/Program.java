package Single_Run_Met_Runnable_2;

public class Program implements Runnable{
	public void run() {
		// checking wheather the thread name is "Number"
		if(Thread.currentThread().getName().equals("Number")) {
			// call numprinting
			numprinting();
		}
		// other wise
		else {
			// call charprinting
			charprinting();
		}
	}
	// Method for num printing
	public void numprinting(){
		System.out.println("Number printing started:");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number printing ended");
	}
	// Method for char printing
	public void charprinting() {
		System.out.println("Charter printing started:");
		for(char i='A';i<='E';i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Charecter printing ended");
	}
}
