package Demon_Steps_1;

public class Compilation extends Thread{
	public void run() {
		try {
			for( ; ; ) {
				System.out.println("Compiling the code");
				Thread.sleep(3000);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}