package Demon_Steps_1;


public class EclipsApp {

	public static void main(String[] args) {
		Typing type=new Typing();
		Compilation cmp=new Compilation();
		Saving sav=new Saving();
		// Step 2 
		cmp.setDaemon(true); 
		sav.setDaemon(true);
		
		type.start();
		cmp.start();
		sav.start();
	}

}
