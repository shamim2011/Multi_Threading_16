package Demon_Thread_1;

public class EclipsApp {

	public static void main(String[] args) {
		Typing type=new Typing();
		Compilation cmp=new Compilation();
		Saving sav=new Saving();
		type.start();
		cmp.start();
		sav.start();
	}

}
