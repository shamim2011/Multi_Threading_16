package Single_Run_Met_Runnable_2;

import Single_Run_Metod_1.Program;

public class ProgramApp {
	public static void main(String[] args) {
		// Creating the thread object
		Program prg1=new Program();
		
		// Create the Thread object
		Thread t1=new Thread(prg1);
		Thread t2=new Thread(prg1);
		// Changing the thread object name
		t1.setName("Number");
		t2.setName("Char");
		
		// Calling the start() which call run()
		t1.start();  // Starting the thread for Number printing
		t2.start();  // Starting the thread for Charecter Printing
		

	}
}
