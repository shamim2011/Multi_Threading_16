package Single_Run_Metod_1;

public class Programapp {

	public static void main(String[] args) {
		// Creating the thread object
		Program t1=new Program();
		Program t2=new Program();
		
		// Changing the thread object name
		t1.setName("Number");
		t2.setName("Char");
		
		// Calling the start() which call run()
		t1.start();  // Starting the thread for Number printing
		t2.start();  // Starting the thread for Charecter Printing
		

	}

}
